package main;

import commands.*;

import java.util.LinkedList;
import java.util.Stack;

/**
 * The layer between the client and the commands that need to be executed on the receivers (DiagramCanvas and DiagramComponent).
 * <br>
 * It is independent of the subtypes of commands, it just receives a command, runs it and implements a redo/undo mechanism.
 */
public class Invoker {

    private Stack undos = new Stack();
    private Stack redos = new Stack();
    /**
     * Clear up all the used resources, start fresh :D
     */
    public void restart() {
      undos = new Stack();
      redos = new Stack();
    }

    /**
     * Executes a given command
     * @param command
     */
    public void execute(DrawCommand command) {
        undos.add(command);
        command.execute();
    }

    /**
     * Undo the latest command
     */
    public void undo() {
        DrawCommand command = (DrawCommand) undos.pop();
        command.undo();
        redos.add(command);
        // TODO
        // Hint: use data structures to keep track of commands
        // Do not use the java.util.Stack, its implementation is based on vector which is inefficient and deprecated.
        // Use a class that implements the Deque interface, e.g. LinkedList https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Deque.html
    }

    /**
     * Redo command previously undone. Cannot perform a redo after an execute, only after at least one undo.
     */
    public void redo() {
        DrawCommand command = (DrawCommand) redos.pop();
        command.execute();
    }
}
