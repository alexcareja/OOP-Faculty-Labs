import java.util.Random;

public class PasswordMaker {
    private static PasswordMaker instance = null;
    private static int contor = 0;
    private String name;
    static private final int MAGIC_NUMBER = 22;
    private final String MAGIC_STRING = "2u3rtqryfsaop[dzomiseywsgj>}{?";

    private PasswordMaker(String name){
        this.name = name;
    }

    public static PasswordMaker getPasswordMakerInstance(String name){
        if(instance == null){
            instance = new PasswordMaker(name);
        }
        contor++;
        return instance;
    }

    String getPassword(){
        RandomStringGenerator gen = new RandomStringGenerator(10, MAGIC_STRING);
        gen = new RandomStringGenerator(MAGIC_NUMBER, gen.next());
        String num = Integer.toString(name.length());
        Random r = new Random();
        num += Integer.toString(r.nextInt(101));
        return gen.next() + num;
    }
}
