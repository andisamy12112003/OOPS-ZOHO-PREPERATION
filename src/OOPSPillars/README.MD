core concepts
=============
1.constructor - It sets initial values for the object
2.this keyword - avoid confusion between instance variables and local variables
3.instance - actual object made from that blueprint
4.object declaration - creating a reference variable for a class
5.object initialization - setting initial values to an object’s data members after the object is created

6.access modifier (access control visibility) *** main.java inside the file 
    1.public 
    2.private 
    3.protected 
    4.default   


7.object relationships
    1.association 
        1.Unidirectional association: one object knows about the other, but not vice versa
        2.Bidirectional association: both objects know about each other
    
    2.aggregation - 1.has-a relationship where one class contains or uses objects of another class
                    2.A Department has Employees. The employees can still exist even 
                    if the department is removed, so this is aggregation.

    3.composition - The part usually cannot exist independently in strong composition.

8.super keyword - To call parent class constructor using super()

9.concrete class - A concrete class is a normal class that is fully implemented and can be              instantiated.

PILLAR OF OPPS 
==============

1.Encapsulation 
2.Inheritance 
    1.Single
    2.multilevel
    3.hierarchical 
    5.multiple
    4.hybrid(diamond problem) 
3.Polymorphism
    1.runtime (method overriding)
    2.complie time (method overloading)
4.Abstract 