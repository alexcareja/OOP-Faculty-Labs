package task2;

import java.util.ArrayList;

class Course {
    private String description;
    private String title;
    private ArrayList<Student> students = new ArrayList<Student>();

    Course(String d, String t){
        this.description = d;
        this.title = t;
    }

    String getDescription() {
        return description;
    }

    String getTitle() {
        return title;
    }

    void enroll(Student s){
        this.students.add(s);
    }

    ArrayList<Student> filterYear(int year){
        ArrayList<Student> lst = new ArrayList<Student>();
        for(Student s:students){
            if(s.getYear() == year){
                lst.add(s);
            }
        }
        return lst;
    }
}

