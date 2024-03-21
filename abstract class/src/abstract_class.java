package unit_2;

abstract class shape {

    abstract void draw();
}

class rectangle extends shape {

    void draw() {
        System.out.println("drawing Rectangle.");
    }
}

class circle extends rectangle {

    void draw() {
        System.out.println("drawing circle.");
    }
}

public class abstract_class {

    public static void main(String[] args) {
        shape s1 = new rectangle();
        shape s2 = new circle();
        s1.draw();
        s2.draw();
    }
}