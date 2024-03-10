class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

public static class Main {
        public static void main(String[] args) {
            System.out.println(Adder.add(11, 12));
            System.out.println(Adder.add(11.2, 23.88));
        }
    }
}