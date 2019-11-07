package first;

import java.util.Random;

public class RandomOutTask implements Task {
    int x;

    public RandomOutTask() {
        Random r = new Random();
        this.x = r.nextInt();
    }
    public void execute(){
        System.out.println("Nr random: " + this.x);
    }
}
