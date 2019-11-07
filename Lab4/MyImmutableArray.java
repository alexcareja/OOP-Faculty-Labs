import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyImmutableArray {
    private final ArrayList<Integer> immutableArray;

    public MyImmutableArray(ArrayList<Integer> immutableArray) {
        this.immutableArray = new ArrayList<Integer>();
        this.immutableArray.addAll(immutableArray);
    }


    List<Integer> getArray(){
        return Collections.unmodifiableList(this.immutableArray);
    }

    @Override
    public String toString() {
        return "MyImmutableArray{" +
                "immutableArray=" + immutableArray +
                '}';
    }
}
