//# Java-Assignment-Inheritance
//Different types of inheritance.

/ Base Class
class Animal {
    void speak() {
        System.out.println("Animals make sounds");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Another Base Class for Multiple Inheritance (via Interface)
interface Walker {
    void walk();
}

// Multiple Inheritance using Interface
class Bird extends Animal implements Walker {
    public void walk() {
        System.out.println("Bird can walk");
    }

    void fly() {
        System.out.println("Bird flies");
    }
}

// Main Class
public class InheritanceDemo {
    public static void main(String[] args) {

        // Single Inheritance
        Dog d = new Dog();
        d.speak();
        d.bark();

        System.out.println();

        // Multilevel Inheritance
        Puppy p = new Puppy();
        p.speak();
        p.bark();
        p.weep();

        System.out.println();

        // Hierarchical Inheritance
        Cat c = new Cat();
        c.speak();
        c.meow();

        System.out.println();

        // Multiple Inheritance
        Bird b = new Bird();
        b.speak();
        b.walk();
        b.fly();
    }
}
