import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        PasswordMaker in = PasswordMaker.getPasswordMakerInstance("asdas");
        System.out.println(in.getPassword());
        System.out.println(in.getPassword());
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(4);
        arr.add(0);
        MyImmutableArray immArr = new MyImmutableArray(arr);
        System.out.println(immArr);
        List<Integer> arr2 = immArr.getArray();
        //arr2.clear();
        System.out.println(arr2);
    }
}
