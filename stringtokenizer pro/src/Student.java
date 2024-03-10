import java.util.*;

public class Student {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my name is abc");
        System.out.println("Total number of Tokens : " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}