1.Constructor 
=============
A constructor is a special method used to initialize an object when it is created. It has the same name as the class and no return type.

    class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    }

    Student s1 = new Student("Asha", 21);

Simple meaning
==============
It runs automatically when you create an object.

It sets initial values for the object.

It helps make the object ready to use.


2.this - keyword 
================

    class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
    }

    public class Main {
        public static void main(String[] args) {
            Student s1 = new Student("Asha", 21);
            s1.display();
        }
    }

this keyword in Java refers to the current object—the object whose method or constructor is being executed.

Uses of this
============
To refer to current class instance variables.

To avoid confusion between instance variables and local variables.

To call another constructor in the same class.

To pass the current object as an argument.

Why this is used here
=====================
In the constructor, name and age are parameter names, so this.name and this.age refer to the object's fields

3.Instance 
==========

    class Student {
        String name;
        int age;
    }

    public class Main {
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.name = "Asha";
            s1.age = 21;
        }
    }

Here, s1 is an instance of the Student class.


An instance is a specific object created from a class. In Java, when you use new, you create an instance that has its own values in memory.

Simple meaning
==============
Class = blueprint.

Instance = actual object made from that blueprint.

Easy memory trick
=================
Think of a class as a cookie cutter and an instance as the cookie made from it.


4.Object declaration 
====================
An object declaration in Java means creating a reference variable for a class. It does not create the actual object yet; the object is created when you use new.

class Car {
    String brand;
}

public class Main {
    public static void main(String[] args) {
        Car c1;          // object declaration
        c1 = new Car();   // object creation
    }
}

5.Object initialization
=======================
Object initialization means setting initial values to an object’s data members after the object is created. In Java, this is usually done using a constructor, setter methods, or direct field assignment.

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Asha", 21);  // object creation + initialization
    }
}

Easy meaning
Declaration: Student s1;

Creation: new Student(...)

Initialization: assigning values like "Asha" and 21 to the object fields.

Another way
===========
class Car {
    String brand;
    int price;
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.price = 1000000;
    }
}

7.Object relationship 
=====================

    1.Association
    ============== 
        class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }
}

class Car {
    String model;

    Car(String model) {
        this.model = model;
    }
}

public class Main {
    public static void main(String[] args) {
        Driver d = new Driver("Asha");
        Car c = new Car("Toyota");

        System.out.println(d.name + " drives " + c.model);
    }
}

Why this is association
=======================
Driver and Car are two separate classes.

One object uses the other object.

Both can exist independently.

Simple interview line
=====================
“Association is a relationship between two independent classes where one object uses another object without owning it.”

    2.Aggregation 
    ==============
    class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    Student student;

    Department(String deptName, Student student) {
        this.deptName = deptName;
        this.student = student;
    }

    void display() {
        System.out.println(deptName + " has student " + student.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Asha");
        Department dept = new Department("CSE", s1);

        dept.display();
    }
}

Why this is aggregation
========================
Student exists independently of Department.

Department uses Student as a part of its relationship.

If the department is removed, the student still exists.

Easy memory line
================
Aggregation means whole has part, but the part can live on its own.

If you want, I can also give you aggregation vs composition in one simple table.


    3.Composition
    =============
Composition in OOP is a strong has-a relationship where one class contains objects of another class, and the contained objects usually depend on the whole object for their lifecycle. It is used to model a part-of relationship, like a Car having an Engine.

Simple meaning
==============
Whole = main object.

Part = object inside the whole.

If the whole is destroyed, the parts usually do not make sense independently in composition.

Example in Java
===============

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    Car() {
        engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}

Why this is composition
=======================
Car contains an Engine.

Engine is part of the Car.

The Car creates and owns the Engine, so the relationship is strong.

Easy memory line
=================
Composition means strong has-a or part-of relationship.


8.super keyword 
=================

class Animal {
    String name = "Animal";

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        System.out.println(name);       // Dog
        System.out.println(super.name); // Animal
    }

    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        d.sound();
    }
}

super keyword in Java refers to the parent class of a child class. It is used to access parent class variables, methods, and constructors.

Uses of super
==============

To access parent class variable when child class has the same variable name.

To call parent class method from child class.

To call parent class constructor using super().

Easy meaning 
============
super.name → parent class variable.

super.sound() → parent class method.

super() → parent class constructor.

Interview line
==============
“super is used in a child class to refer to its immediate parent class members and constructor”.


9. Concrete class
==================

class Bike {
    void ride() {
        System.out.println("Bike is riding");
    }

    void brake() {
        System.out.println("Bike is stopping");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.ride();
        b.brake();
    }
}

Explanation
============
Bike is a concrete class because it has full method implementations.

You can create an object using new Bike().

It is not abstract, so it is complete and usable directly.

Easy meaning
============
A concrete class is a normal class that is fully implemented and can be instantiated.

Simple memory trick
====================
Abstract class = incomplete blueprint.

Concrete class = complete class with working methods.

Interview line
==============
“A concrete class is a class that has implementations for all methods and can be directly instantiated.” 


Compile time:
=============
     is when your code is translated before running, and 
run time:
=========
     is when the program is actually executing.

Simple meaning
==============
Compile time: code is checked and converted.
=============
Run time: the program starts running and doing work.
=========

Example:
========
If you write:

java
====
int a = 10

This gives a compile-time error because the semicolon is missing.

If you write:
============
java
====
int b = 10 / 0;

This may compile, but it fails at run time because division by zero is not allowed.

Easy difference
===============

Compile time = before execution.

Run time = during execution.

Interview line
==============
“Compile time is the stage where the source code is checked and translated, while run time is the stage where the program actually runs and errors appear during execution”.