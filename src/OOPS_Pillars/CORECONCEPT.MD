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

In Java, an instance variable is a variable declared within a class but outside of any method, constructor, or block. Because each object (instance) of the class maintains its own unique copy of these variables, the values stored in them can differ from one object to another


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

class Animal {
Animal() {
System.out.println("Animal is created");
}
}

class Dog extends Animal {
Dog() {
super();
System.out.println("Dog is created");
}


}

class PRACTICEPLACE{
public static void main(String[] args) {
Dog d = new Dog();
}
}

// the constructor special method is automatically called.

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
===========
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
“Compile time is the stage where the source code is checked and translated, while run 
time is the stage where the program actually runs and errors appear during execution”.

Compile time
============
Happens before the program starts running.

The compiler checks syntax, types, and other rules.

Example: missing semicolon, undeclared variable, or type mismatch.

Runtime
=======
Happens while the program is running.

The program is already executing in memory.

Example: divide by zero, null reference, or file not found during execution.


object Declaration inside the class two types
=============================================
Wrong code
==========
class Student {
String name;
int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println(name+ " "+ age);
    }
}

class PrintStudent{
private Student stu;
void print(Student stu){
return stu.display();
}
}

public class PRACTICEPLACE{
public static void main(){
Student stu1 = new Student("Andisamy A",21);
}
} find error


Explaination
============
There are a few compile errors in your code.

Errors
======
return stu.display(); is wrong.

display() returns void, so you cannot return it.

Use just stu.display();

public static void main() is incomplete.

Java main method should be:

java
=====
public static void main(String[] args)

You create stu1, but you never use it.

You should pass it to print().

private Student stu; inside PrintStudent is not being used.

It is not an error, but it is unnecessary in your current code.

Corrected code
==============
class Student {
String name;
int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name + " " + age);
    }
}

class PrintStudent {
void print(Student stu) {
stu.display();
}
}

public class PRACTICEPLACE {
public static void main(String[] args) {
Student stu1 = new Student("Andisamy A", 21);
PrintStudent ps = new PrintStudent();
ps.print(stu1);
}
}

Second type
===========
wrong code
==========

class Student {
String name;
int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println(name+ " "+ age);
    }
}

class PrintStudent{
private Student stu;
void print(){
stu.display();
}
}


public class PRACTICEPLACE{
public static void main(){
Student stu1 = new Student("Andisamy A",21);

        PrintStudent pr = new PrintStudent();
        pr.print();
    }
} 


Errors
======
stu is never initialized in PrintStudent.

You declared private Student stu;, but you never assigned a Student object to it.

So this line:
=============
java
====
stu.display();
will cause a NullPointerException at runtime.

main() method signature is wrong.

It should be:
=============
java
====
public static void main(String[] args)
not:
====
java
====
public static void main()


correct code:
=============
class Student {
String name;
int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name + " " + age);
    }
}

class PrintStudent {
private Student stu;

    PrintStudent(Student stu) {
        this.stu = stu;
    }

    void print() {
        stu.display();
    }
}

public class PRACTICEPLACE {
public static void main(String[] args) {
Student stu1 = new Student("Andisamy A", 21);

        PrintStudent pr = new PrintStudent(stu1);
        pr.print();
    }
} 


Simple reason
=============
stu1 is created in main.

You must pass stu1 into PrintStudent.

Then print() can call stu.display() safely.


Your code shows an aggregation relationship, which is a has-a relationship.

Why aggregation
===============
PrintStudent has a Student object as a field: private Student stu;.

The Student object is created outside PrintStudent and passed in from main.

That means PrintStudent uses the Student object, but it does not own its creation.

In your code
============
java
====
class PrintStudent {
private Student stu;
}

This means:
===========
PrintStudent has a Student.

The Student object can exist independently of PrintStudent.

So this is aggregation, not composition.

Easy way to remember
====================
Composition: strong ownership, part cannot live without whole.

Aggregation: weak ownership, part can live independently.

In your program, stu1 is created in main, then given to PrintStudent, so the relationship is aggregation.


Composition is a strong has-a / part-of relationship where one object owns another object and the child cannot live independently.
==================================================================================================================================
Simple example
=============
java
====
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
Car c = new Car();
c.drive();
}
}

Why this is composition
=======================
Car creates and owns Engine.

Engine is part of Car.

If the Car object is gone, the Engine inside it is also gone, so their lifecycles are tied.

Easy memory trick
=================
Aggregation = weak has-a, child can live separately.

Composition = strong has-a, child depends on parent.


In Java OOP, casting means converting one type of reference to another compatible type.
=======================================================================================
Types of casting
================
Widening casting: smaller type to larger type, done automatically.

Narrowing casting: larger type to smaller type, done manually with a cast.

Object casting in OOP
=====================
For objects, casting usually means upcasting and downcasting.

Upcasting
=========
java
====
   Bird b = new Sparrow();
   Sparrow object is stored in a Bird reference.

This is automatic.

You can use only parent-class members through that reference.

Downcasting
===========
java
====
   Sparrow s = (Sparrow) b;
   Converts parent reference back to child type.

This is explicit.
================
It should be used only when the actual object is really a Sparrow, or it may throw ClassCastException.

Simple example
==============
java
====
class Animal {
void eat() {
System.out.println("Eating");
}
}

class Dog extends Animal {
void bark() {
System.out.println("Barking");
}
}

public class Main {
public static void main(String[] args) {

Animal a = new Dog();   // upcasting
a.eat();

Dog d = (Dog) a;        // downcasting
d.bark();

    }
}

Easy meaning
============
Upcasting = child to parent.

Downcasting = parent to child.

Upcasting is safe and automatic.
=========
Downcasting needs care and may fail if the object is not really that child type.
===========
In Java OOP, implicit means Java does something automatically, while explicit means you do it manually yourself.

Simple difference
=================
Implicit: done automatically by Java/JVM/compiler.

Explicit: written clearly by the programmer using code or casting syntax.

In casting
==========
Implicit casting happens automatically, usually from smaller type to larger type, like int to double.

Explicit casting needs a manual cast, like (int) 10.5, because Java will not do it by itself.

In OOP terms
============
Implicit upcasting:
===================
java
====
Animal a = new Dog();
Java allows this automatically.

Explicit downcasting:
=====================
java
====
Dog d = (Dog) a;
You must write (Dog) yourself.

Easy memory trick
=================
Implicit = automatic
Explicit = manual

