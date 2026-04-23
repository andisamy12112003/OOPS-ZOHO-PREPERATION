package OOPSPillars;/*
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

                      OOPSPillars.Animal
                     /      \
                  OOPSPillars.Dog        OOPSPillars.Tiger
                  |            |
                 OOPSPillars.Pet          OOPSPillars.Wild

Why this is hybrid:
OOPSPillars.Dog and OOPSPillars.Tiger both inherit from OOPSPillars.Animal → hierarchical inheritance.

OOPSPillars.Dog also implements OOPSPillars.Pet, and OOPSPillars.Tiger implements OOPSPillars.Wild → multiple inheritance through interfaces.

Together, this makes it hybrid inheritance.

*/

class Animals {
    void eat() {
        System.out.println("OOPSPillars.Animal eats");
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
        System.out.println("OOPSPillars.Dog plays");
    }

    void bark() {
        System.out.println("OOPSPillars.Dog barks");
    }
}

class Tiger extends Animal implements Wild {
    public void hunt() {
        System.out.println("OOPSPillars.Tiger hunts");
    }

    void roar() {
        System.out.println("OOPSPillars.Tiger roars");
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
