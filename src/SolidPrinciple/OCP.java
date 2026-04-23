package SolidPrinciple;

/*
    ====================== key concepts =======================
OCP - open closed principle

    ===================== next topic ==========================
LSP - liskov substitution principle

Open/Closed Principle
=====================
the Open/Closed Principle (OCP) in Java with both a violating example and a corrected example.
OCP means a class should be open for extension but closed for modification.

1) Code that violates OCP
=========================

class ShapeCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.length * r.width;
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * c.radius * c.radius;
        }
        return 0;
    }
}

class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
}

Why this violates OCP
If you add a new shape like Triangle, you must modify ShapeCalculator again.
 That means the class is not closed for modification.

2) Code that follows OCP

 */

interface Shape {
    double area();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class ShapeCalculator {
    public double calculateArea(Shape shape) {
        return shape.area(); // return type
    }
}

public class OCP {
    public static void main(String[] args){
        Rectangle rec = new Rectangle(123.34,323.32);
        Circle cir = new Circle(123.3);
        ShapeCalculator shape = new ShapeCalculator();

        double recArea = shape.calculateArea(rec);
        double cirArea = shape.calculateArea(cir); // Use the variable initialization for return type

        // direct variable or without variable initialization
        System.out.println("Area of rectangle: " + rec.area());
        System.out.println("Area of Circle: " + cir.area());

        // with variable
        System.out.println("Area of rectangle: " + recArea);
        System.out.println("Area of Circle: " + cirArea);

    }
}
