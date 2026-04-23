package SolidPrinciple;

/*

    ====================== key concepts =======================
LSP - liskov substitution principle

    ===================== next topic ==========================

ISP - interface segregation Principle

Liskov Substitution Principle (LSP)
===================================
The Liskov Substitution Principle (LSP) in Java. LSP says that a subclass
should be usable anywhere its parent class is expected without breaking the program.


Violating code
=============

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        bird1.fly();

        Bird bird2 = new Penguin();
        bird2.fly(); // This breaks the program
    }
}


Why this violates LSP
Penguin cannot behave like a normal Bird with fly(), so replacing
Bird with Penguin breaks expected behavior.

Correct code
============
Why this follows LSP
Now only birds that can fly implement Flyable, so Penguin is no longer forced into a behavior it cannot support.

Easy memory trick
Bad design: Bird has fly(), but not all birds can fly.

Good design: separate Flyable for flying birds, and keep Bird for common behavior like eat()
 */

class Bird {
    public void eat() {
        System.out.println("Bird is eating");
    }
}

interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin extends Bird {
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}

public class LSP {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        bird1.eat();
        ((Flyable) bird1).fly();

        Bird bird2 = new Penguin();
        bird2.eat();
        ((Penguin) bird2).swim();
    }
}
