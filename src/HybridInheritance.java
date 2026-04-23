/*
====================== key Comcepts ================
 hybrid inheritance

==================== next =======================
 Diamond problem

//Hybrid inheritance -
Hybrid inheritance is a combination of two or more inheritance types in one program.
In Java, it is usually shown using single + hierarchical inheritance or by using
interfaces when multiple inheritance is involved.

================== diagram =====================

            A
          /   \
         B     C
        / \     \
       D   E     F
            \    /
             \  /
               G

This combines:
Hierarchical inheritance: A -> B, A -> C.

Multilevel inheritance: B -> D, B -> E, C -> F.

Multiple inheritance concept at the bottom with G

====================== diagram ==============================

                      Animal
                     /      \
                  Dog        Tiger
                  |            |
                 Pet          Wild

Why this is hybrid:
Dog and Tiger both inherit from Animal → hierarchical inheritance.

Dog also implements Pet, and Tiger implements Wild → multiple inheritance through interfaces.

Together, this makes it hybrid inheritance.

*/

class Animals {
    void eat() {
        System.out.println("Animal eats");
    }
}

interface Pet {
    void play();
}

interface Wild {
    void hunt();
}

class Dogs extends Animals implements Pet {
    public void play() {
        System.out.println("Dog plays");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

class Tiger extends Animal implements Wild {
    public void hunt() {
        System.out.println("Tiger hunts");
    }

    void roar() {
        System.out.println("Tiger roars");
    }
}


public class HybridInheritance {
        public static void main(String[] args) {
            Dogs d = new Dogs();
            d.eat();
            d.play();
            d.bark();

            Tiger t = new Tiger();
            t.eat();
            t.hunt();
            t.roar();

    }
}
