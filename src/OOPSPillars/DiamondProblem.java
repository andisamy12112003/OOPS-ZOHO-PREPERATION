package OOPSPillars;/*
========================== key concepts ==========================
Diamond problem

========================== next topic ==========================
OOPSPillars.Polymorphism

Diamond Problem:
           The diamond problem is the ambiguity that happens when a class inherits
           the same method from two parent paths.

================== diagram ======================

                   OOPSPillars.A(class)
                     / \
         OOPSPillars.B(interface)   OOPSPillars.C(interface)
                     \ /
             OOPSPillars.D(class OOPSPillars.D extends or inherit OOPSPillars.A class and implements OOPSPillars.B, OOPSPillars.C class)

Example in Java :
        Java does not allow multiple inheritance of classes,
        so this exact case cannot happen with classes.

But a similar problem can happen with interfaces
that have the same default method:

 */

class A {
    void printA(){
        System.out.println("OOPSPillars.A");
    }
}

interface B {
    void printA();
}

interface C {
    void printA();
}

class D extends A implements B,C{
    @Override
    public void printA(){
        System.out.println("OOPSPillars.D");
    }
}

class DiamondProblem{
    public static void main(String arg[]){
        D d = new D();
        d.printA();
    }
}
