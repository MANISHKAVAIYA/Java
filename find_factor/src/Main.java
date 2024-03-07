import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter value of factor : ");
        int ab=scanner.nextInt();

        System.out.println("please enter which value to module : ");
        int cd=scanner.nextInt();
        scanner.close();

        if (cd!=0 && (ab%cd)==0){
            System.out.println(cd+" is factor of ab "+ab);
        }
        else {
            System.out.printf(cd+" is not factor of ab " +ab);
        }
    }
}