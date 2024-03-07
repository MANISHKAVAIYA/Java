import java.util.*;

public class Main {
    public static void main(String[] args) {

        // using of one & operator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of a : ");
        int a = scanner.nextInt();

        System.out.println("Please enter the value of b : ");
        int b  = scanner.nextInt();

        if (a>0 & b>0) {
            System.out.println("Both conditions are true ");
        }
        else {
            System.out.println("At least one condition is false");
        }

        //using of && double operator
        System.out.println("please enter value of first : ");
        int first = scanner.nextInt();

        System.out.println("please enter value of second : ");
        int second = scanner.nextInt();

        if (first>0 && second>0){
            System.out.println("Both are true");
        }

        else {
            System.out.println("any one condition is false");
        }
    }
}