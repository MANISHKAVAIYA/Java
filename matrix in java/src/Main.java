import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n, c, j;
        System.out.println("Enter the number of rows and columns : ");
        m = scan.nextInt();
        n = scan.nextInt();
        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];
        System.out.println("Enter the elements of the first matrix : ");
        for (c = 0; c < m; c++) {
            for (j = 0; j < n; j++) {
                first[c][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix : ");
        for (c = 0; c < m; c++) {
            for (j = 0; j < n; j++) {
                second[c][j] = scan.nextInt();
            }
        }
        for (c = 0; c < m; c++) {
            for (j = 0; j < n; j++) {
                sum[c][j] = first[c][j] + second[c][j];
            }
        }
        System.out.println("Sum of the matrices : ");
        for (c = 0; c < m; c++) {
            for (j = 0; j < n; j++) {
                System.out.print(sum[c][j] + "\t");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
