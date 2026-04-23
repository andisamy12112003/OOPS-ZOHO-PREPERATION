/*
================== key concepts ==========================
polymorphism
types - runtime(method overriding) , compile time(method overloading)

================= next topic ==========================
Polymorphism1 - compile time(method overloading)

==================== Runtime(Method overriding) ========================
        **This uses method overriding, where the child class provides its own version of the parent method

 */



class Payment {
    void pay() {
        System.out.println("Processing payment");
    }
}

class UpiPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Paying using UPI");
    }
}

class CardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Paying using Card");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Payment p;

        p = new UpiPayment();
        p.pay();

        p = new CardPayment();
        p.pay();
    }
}
