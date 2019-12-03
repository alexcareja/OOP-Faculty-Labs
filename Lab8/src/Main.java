import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(0, "Lcui", "Rgigore", 10);
        Student s2 = new Student(1, "Dei", "Loteanu", 11);
        Student s3 = new Student(15, "Urxi", "Paostol", 20);
        Student s4 = new Student(2, "Umi", "Daelin", 7);
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.sort(Student::compareTo);
        System.out.println(arr);
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getId() < o2.getId()) {
                    return -1;
                }
                else if(o1.getId() > o2.getId()){
                    return 1;
                }
                return 0;
            }
        });

        //arr.sort((Student s_1, Student s_2) -> Long.compare(s_1.getId(), s_2.getId()));
        //arr.sort(Comparator.comparingLong(Student::getId));
        pq.addAll(arr);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        LinkedList<String> filo = new LinkedList<>();
        LinkedList<String> mateinfo = new LinkedList<>();
        filo.add("Romana");
        filo.add("SSU");
        mateinfo.add("mate");
        mateinfo.add("info");
        HashMap<Student, LinkedList> stud_mat = new HashMap<>();
        stud_mat.put(s1, mateinfo);
        stud_mat.put(s2, mateinfo);
        stud_mat.put(s3, mateinfo);
        stud_mat.put(s4, filo);
        System.out.println(stud_mat);

        LinkedEvenHash<Integer> pare = new LinkedEvenHash<Integer>();
        pare.add(1);
        pare.add(12);
        pare.add(29912);
        pare.add(111);
        List<Integer> l = new ArrayList<>();
        l.add(122);
        l.add(9);
        l.add(19);
        l.add(200);
        pare.addAll(l);
        for(int n : pare){
            System.out.println(n);
        }
        //System.out.println(pare);
    }
}
