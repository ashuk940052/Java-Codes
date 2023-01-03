package object_oriented_programing;
import java.util.*;
public class Student_use {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Student s1 = new Student();
       Student s2 = new Student();

        s1.name = "prashant";
        s1.setRoll_no(100);
        System.out.println(s1.name+" -- "+s1.getRoll_no());
        s2.name = "ashu";
        s2.setRoll_no(99);
        System.out.println(s2.name+" -- "+s2.getRoll_no());


    }
}
