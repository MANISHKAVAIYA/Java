// This program is basically use of final class

package unit_2;

final class main_class {

    void setData() {
        System.out.println("That is parent class");
    }
}

//show the runtime compile time error
class sub_class extends main_class {

    void setData() {
        System.out.println("That is sub class");
    }
}

public class final_class {

    public static void main(String[] args) {
        main_class obj = new sub_class();
        obj.setData();
    }
}
