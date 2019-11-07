package first;

public class CounterOutTask implements Task{
    private static int contor;

    public CounterOutTask() {
        contor = 0;
    }
    public void execute(){
        contor++;
        System.out.println("contor = " + contor);
    }
}
