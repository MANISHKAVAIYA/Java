import java.lang.*;
class Animal {
    Animal() {
        System.out.println("From Animal Constructor : ");
    }
    void eat() {
        System.out.println("Eating...");
    }
    protected void profinal() {
        System.out.println("End of Animal.");
    }
}
class Dog extends Animal {
    Dog() {
        System.out.println("From Dog Constructor : ");
    }

    void bark() {
        System.out.println("Barking....");
    }

    protected void profinal() {
        System.out.println("End of Dogs.");
    }
}

class BabyDog extends Dog {
    BabyDog() {
        System.out.println("From BabyDog Constructor : ");
    }

    void weep() {
        System.out.println("Weeping...");
    }

    protected void profinal() {
        System.out.println("End of BabyDogs.");
    }
}

public class Main {
    public static void main(String[] args) {
        BabyDog bg = new BabyDog();
        bg.eat();
        bg.bark();
        bg.weep();
        bg = null;
        System.gc();
    }
}