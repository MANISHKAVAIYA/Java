import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any one vowel or consonant : ");
        char ch = scan.next().charAt(0);
        switch (ch){
            case 'a':
                System.out.println("Vowels");
                break;
            case 'u':
                System.out.println("Vowels");
                break;
            case 'i':
                System.out.println("Vowels");
                break;
            case 'o':
                System.out.println("Vowels");
                break;
            case 'e':
                System.out.println("Vowels");
                break;
            case 'A':
                System.out.println("Vowels");
                break;
            case 'U':
                System.out.println("Vowels");
                break;
            case 'I':
                System.out.println("Vowels");
                break;
            case 'O':
                System.out.println("Vowels");
                break;
            case 'E':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}