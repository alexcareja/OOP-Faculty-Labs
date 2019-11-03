package task2;

import java.util.Objects;

public class Student {
    private int year;
    private String name;

    int getYear() {
        return year;
    }

    String getName() {
        return name;
    }

    Student(int y, String n){
        this.year = y;
        this.name = n;
    }

    @Override
    public String toString() {
        return "Student{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
