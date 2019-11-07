package second;

import first.Task;

import java.util.ArrayList;

public class Queue implements Container{
    ArrayList<Task> tasks;

    public Queue(){
        tasks = new ArrayList<>();
    }

    public Task pop(){
        Task t = tasks.get(0);
        tasks.remove(0);
        return t;
    }

    /**
     * Inserts a Task in the Container.
     *
     * @param task the inserted Task
     */
    public void push(Task task){
        tasks.add(task);
    }

    public int size(){
        return tasks.size();
    }

    public boolean isEmpty(){
        return tasks.size() == 0;
    }

    public void transferFrom(Container container){
        while (container.size() > 0){
            tasks.add(container.pop());
        }
    }
}
