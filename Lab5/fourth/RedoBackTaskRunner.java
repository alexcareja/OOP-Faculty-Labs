package fourth;

import first.Task;
import second.Stack;
import third.Strategy;

import java.util.Calendar;

public class RedoBackTaskRunner extends AbstractTaskRunner {

    Stack tasks;

    public RedoBackTaskRunner(Strategy strategy){
        super(strategy);
        tasks = new Stack();
    }

    protected void afterExecution(Task task){
        tasks.push(task);
    }

    public void redo(){
        while (!tasks.isEmpty()){
            tasks.pop().execute();
        }
    }
}
