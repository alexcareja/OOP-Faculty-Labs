package task2;

import java.util.Arrays;

public class CourseTest {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Edi");
        Student s2 = new Student(2, "Luci");
        Student s3 = new Student(3, "Miu");
        Course C1 = new Course("Boring", "Metode Numerice");
        C1.enroll(s1);
        C1.enroll(s2);
        C1.enroll(s3);
        System.out.println(Arrays.toString(C1.filterYear(2).toArray()));

        Student x = new Student(1, "Alex");
        Student y = new Student(1, "Alex");
        System.out.println(x.equals(y));
    }
}
