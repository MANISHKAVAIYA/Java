class Varg {
    static void display(int... a) {
        System.out.println("hello");
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        display();
        display(1, 2, 3, 4);
        display(32, 23);
    }
}