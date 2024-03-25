/**
 *  Author : Manish Kavaiya
 */
package unit_2;

import java.util.*;

class Danger_Anger {

    Scanner scan = new Scanner(System.in);

    Danger_Anger() {
        System.out.println("Constructor of Danger_Anger");
    }

    void angryLevel_1() {
        System.out.println("Please Enter your Anger High or low or medium? :");
        String high = scan.next();
        System.out.println("Don't check any people anger side.");
    }

    protected void most_Anger_level1() {
        System.out.println("End of Ander life");
    }
}

class Medium_Anger extends Danger_Anger {

    Medium_Anger() {
        System.out.println("Constructor of Medium of Anger Life.");
    }

    void angryLeverl_2() {
        System.out.println("Please enter your anger in rating type : ");
        String number1 = scan.next();
        System.out.println("That is level of Anger Life.");
    }

    protected void most_Anger_level2() {
        System.out.println("End of Medium Anger Life");
    }
}

class Normal_Anger extends Medium_Anger {

    Normal_Anger() {
        System.out.println("Constructor of Normal Life Anger.");
    }

    void angryLevel_3() {
        System.out.println("Please enter your Anter rasio out of 100 : ");
        int rasiotype = scan.nextInt();
        System.out.println("That is a very low level of anger life.");
    }

    protected void most_Anger_level3() {
        System.out.println("End of Normall Anger Life.");
    }
}

public class cons_inheritance {

    public static void main(String[] args) {
        Normal_Anger very_Angry = new Normal_Anger();
        very_Angry.angryLevel_1();
        very_Angry.angryLeverl_2();
        very_Angry.angryLevel_3();
        very_Angry = null;
        System.gc();
    }
}
