// ============= key concepts =============
// interface and implements
// multiple inheritance

// ============= next topic ===============
// hybrid inheritance and diamond problem

/*

***** In java does not support multiple inheritance with classes because of the ambiguity
problem. Instead, Java uses interfaces to achieve a similar effect.*****

**** Interface - An interface in Java is like a contract or blueprint that tells a class what
            methods it must have, but not how to do them.
contract
========
In Java, contract means the agreement a class or method promises to follow.
It describes what inputs are allowed, what output or behavior to expect, and
what rules subclasses or callers must obey.

Simple meaning
==============
A contract says, “If you use this class or method correctly, this is what it guarantees to
do.” For example, if a class says it implements equals(), it must also follow the hashCode()
contract so equal objects produce the same hash code

========================== Interface key takeaway ===========================================

* Tells what to do but not how to do
* Methods are abstract and public by default
* Methods can be defined in interface from java 1.8 with the keyword default
* Variables are final, static and public by default
* Interface cannot be instantiated - no constructors
* A class can implement interface/interfaces
* Class implementing interface should define all abstract methods in interface
* Supports multiple inheritance
* interface act like an abstract.
* interface can't to instantiate ( create an object ).
* interface method must implement the class.
* interface method don't have body. but we can create a body with use of default key word.
* interface properties can't to change because the all properties default have (final keyword)
* the class inherits only one class but the class implements multiple interfaces.

**** Implements -  The implements keyword is used when a class agrees to follow that
 contract and provide the method bodies.

 *** this video for better understanding
 interface and implementation = https://youtu.be/F3bELzeDa4U?si=sC6u61sWzShJ63gc

multiple inheritance - Multiple inheritance means a class inherits from more than one parent class.

=============== diagram =============

     A(no inherit)    B (no inherit)
                 \   /
                  \ /
                   C
         ( C inherits A and B )

C is the child class, and A and B are the parent classes.

*/

interface Mom {
    void getMomName();
}

interface Dad {
    void getDadName();

}

class Child implements Dad ,Mom {
    // mom data
    String momName = "kathammal A";
    byte momAge = 42;
    // dad data
    String dadName = "Andikalai P";
    byte dadAge = 52;
    //child data
    String childName = "Andisamy A";

    public void getDadName(){
        System.out.println(dadName);
    }
    public void childName(){
        System.out.println(childName);
    }
    public void getMomName(){
        System.out.println(momName);
    }
}

public class MultipleInheritance {
    public static void main(String arg[]){
         /*
         Dad d = new Dad();
            1. new Dad() is invalid
            2. Dad is an interface, so you cannot create an object of it.
         correct:
            1. Dad d = new Child();
         */

        Dad d = new Child(); // you can only access on dad class methods

        Child chil1 = new Child();
        chil1.childName();
        chil1.getMomName();
        chil1.getDadName();
    }
}
