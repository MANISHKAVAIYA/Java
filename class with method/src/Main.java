/***
 *  Author : Manish Kavaiya
 *  This program is very unique.
 *  Do you use this code your project.
 *  This code basically use of user input the data and predefined value.
 ***/
package unit_1;

import java.util.*;

class studenthello {

    int id1;
    String name1;
    float marks1;

    //declare method
    public void gethellodata(int x, String y, float z) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enterr value of x : ");
        id1 = x;
        id1 = scan.nextInt();
        System.out.println("Please enterr value of y : ");
        name1 = y;
        name1 = scan.next();
        System.out.println("Please enterr value of z : ");
        marks1 = z;
        marks1 = scan.nextInt();
    }

    public void sethellodata() {
        System.out.println(id1 + " " + name1 + " " + marks1);
    }
}

public class class_method_practice {

    public static void main(String[] args) {

        studenthello e1 = new studenthello();
        studenthello e2 = new studenthello();
        e1.gethellodata(0, " ", 0);
        e2.gethellodata(0, " ", 0);
        e1.sethellodata();
        e2.sethellodata();
    }
}
