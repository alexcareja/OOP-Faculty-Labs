import java.util.*;
import java.lang.*;

public class Student implements Comparable{
    private long id;
    private String name;
    private String surname;
    private double averageGrade;

    public Student(long id, String name, String surname, double averageGrade) {
        this.id = id; 
        this.name = name;
        this.surname = surname;
        this.averageGrade = averageGrade;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAverageGrade() {
        return this.averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "{"
                +this.id
                + ". "
                + this.name
                + " "
                + this.surname
                + " | "
                + this.averageGrade
                +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.averageGrade, averageGrade) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, averageGrade);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        Student s = (Student)obj;
//        if(this.getId() == s.getId()){

    //            return true;
//        }
//        return false;
//    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        if(this.averageGrade < s.getAverageGrade()){
            return -1;
        }
        else{
            if(this.averageGrade > s.getAverageGrade()){
                return 1;
            }
        }
        // Aici au aceeasi medie
        if(this.name.compareTo(s.getName()) < 0){
            return -1;
        }
        else {
            if(this.name.compareTo(s.getName()) > 0){
                return 1;
            }
        }
        // Aici au ceeasi medie si name
        if(this.surname.compareTo(s.getSurname()) < 0){
            return -1;
        }
        else{
            if(this.surname.compareTo(s.getSurname()) > 0){
                return 1;
            }
        }
        // au tot identic
        return 0;
    }
}