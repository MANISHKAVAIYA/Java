import java.lang.*;

public class variable1 {
    public static void main(String args[]) {
        // Check if there are at least two command line arguments
        if (args.length < 2) {
            System.out.println("Please provide at least two integers as command line arguments.");
            return; // Exit the program
        }

        // Parsing the command line arguments to integers
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);

        // Comparing the values of i and j
        if (i > j) {
            System.out.println(i + " is greater than " + j);
        } else {
            System.out.println(j + " is greater than " + i);
        }
    }
}
