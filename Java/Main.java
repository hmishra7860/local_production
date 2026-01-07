// Animal.java
abstract class Animal {
    abstract void sound();  // Abstract method

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat(); // Polymorphism, using Animal reference for Cat object
        cat.sound();            // Calls overridden method in Cat
        cat.sleep();            // Calls inherited method from Animal
    }
}
