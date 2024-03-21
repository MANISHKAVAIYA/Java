package unit_1;

import java.util.*;

public class pass_array1 {

    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value in the array: " + min);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scan.nextInt();

        int a[] = new int[n]; 

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt(); 
        }
        min(a);
    }
}
