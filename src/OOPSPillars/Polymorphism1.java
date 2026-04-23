package OOPSPillars;/*
==================== key concepts ============================
OOPSPillars.Polymorphism1 - compile time(method overloading)

==================== next topic ===========================
OOPSPillars.Abstraction

========================== compile time ( method overloading) ===========================
      ****This uses method overloading, where the method name is the same but the parameters are different


      Feature	            |        Compile-time polymorphism	  |   Runtime polymorphism
     =======================================================================================
      Decision time	                     Compile time                   Runtime
     Achieved by	                 Method overloading             Method overriding
        Binding	                      Early/static binding          Late/dynamic binding
     OOPSPillars.Inheritance needed	                  Not necessary                  Required
    =========================================================================================

 */

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2.5, 3.5));
        System.out.println(calc.add(1, 2, 3));
    }
}
