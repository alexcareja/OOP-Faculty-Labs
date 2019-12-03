import java.util.*;

public class LinkedEvenHash<E> extends TreeSet<Integer> {

    LinkedEvenHash() {
        super();
    }

    @Override
    public boolean add(Integer o) {
        int n = (Integer) o;
        if (n % 2 == 0) {
            return super.add(o);
        }
        return false;
    }


    @Override
    public boolean addAll(Collection c) {
        List<Integer> l= new ArrayList<>();
        for(Object o:c){
            int n = (Integer)o;
            if(n%2 == 0){
                l.add(n);
            }
        }
        return super.addAll(l);
    }
}
