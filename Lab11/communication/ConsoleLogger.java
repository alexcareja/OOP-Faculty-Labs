package communication;

import java.util.Observable;
import java.util.Observer;

public class ConsoleLogger implements Observer {

    public ConsoleLogger() {
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
