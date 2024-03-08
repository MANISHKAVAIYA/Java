class Animal {
    void eat() {
        System.out.println("Barking");
    }
}
    class Dog extends Animal {
        void bark() {
            System.out.println("Barking");
        }
    }
        class Main {
            public static void main(String[] args) {
                Dog d=new Dog();
                d.eat();
                d.bark();
            }
        }