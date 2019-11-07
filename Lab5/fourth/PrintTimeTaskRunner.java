package fourth;

import first.Task;
import third.Strategy;

import java.util.Calendar;

public class PrintTimeTaskRunner extends AbstractTaskRunner {

    public PrintTimeTaskRunner(Strategy strategy){
        super(strategy);

    }
    protected void afterExecution(Task task){
        Calendar now = Calendar.getInstance();
        System.out.println("Ora: " + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));
    }
}
