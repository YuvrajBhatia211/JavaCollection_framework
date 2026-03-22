//this will teach you how to make custom class set and implmement it

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class student {
    String name ;
    int rollno;

    public student(String name , int rollno){
        this.name = name;
        this.rollno=rollno;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
    //this equal function basically return boolean value and checks whether both objects have same data elements
    //for example two students have same rollno then it will return true
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }

    public static void main(String[] args){
        Set<student> st = new HashSet<>();

        st.add(new student("rohit" , 2));
        st.add(new student("yuci" , 5));
        st.add(new student("shreya" , 3));
        st.add(new student("rohit" , 2));

        System.out.println(st);
    }
}
