package unit_2;

import java.util.*;

interface Student {

    public void name();

    public void role();
}

class Student_no implements Student {

    Scanner scan = new Scanner(System.in);

    public void name() {

        System.out.print("Please enter the student name : ");
        String name2 = scan.next();
        System.out.println("First Student name : " + name2);
    }

    public void role() {
        System.out.println("Please enter student role : ");
        String roleno = scan.next();
        System.out.println("Student's role is : " + roleno);
    }
}

public class interface_in_java {

    public static void main(String[] args) {
        Student_no stn = new Student_no();
        stn.name();
        stn.role();
    }
}
