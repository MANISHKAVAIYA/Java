
public class Main {
    public static void main(String[] args) {
        boolean a, b;
        System.out.println("P\tQ\tP AND Q\tP OR Q\tP XOR Q\tNOT");

        // Assuming you want to show the truth values for P, Q, P AND Q, P OR Q, P XOR Q, and NOT P
        for (a = false; !a; a = !a) {
            for (b = false; !b; b = !b) {
                System.out.println(a + "\t" + b + "\t" + (a && b) + "\t" + (a || b) + "\t" + (a ^ b) + "\t" + !a);
            }
        }
    }
}