package fourth;

import first.Task;
import third.Strategy;

import java.util.Calendar;

public class CounterTaskRunner extends AbstractTaskRunner {
    public static int contor;
    public CounterTaskRunner(Strategy strategy){
        super(strategy);
        contor = 0;
    }

    protected void afterExecution(Task task){
        contor++;
    }

    public int getCounter(){
        return contor;
    }
}
