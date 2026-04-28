package SOLID_Principle;
/*

===================== key concepts ====================
ISP - interface segregation Principle

===================== next topic ======================
DIP - Dependency Inversion Principle


Interface Segregation Principle
===============================
The Interface Segregation Principle (ISP) in Java with both a violating example and a
 corrected example. ISP says that a client should not be forced to depend on methods it does not use.

1) Code that violates ISP
=========================

interface Restaurant {
    void acceptOnlineOrder();
    void acceptTelephoneOrder();
    void acceptWalkInOrder();
    void payOnline();
    void payInPerson();
}

class OnlineCustomer implements Restaurant {
    public void acceptOnlineOrder() {
        System.out.println("Online order accepted");
    }

    public void acceptTelephoneOrder() {
        throw new UnsupportedOperationException("Not needed");
    }

    public void acceptWalkInOrder() {
        throw new UnsupportedOperationException("Not needed");
    }

    public void payOnline() {
        System.out.println("Paid online");
    }

    public void payInPerson() {
        throw new UnsupportedOperationException("Not needed");
    }
}

Why this violates ISP
OnlineCustomer is forced to implement methods like acceptTelephoneOrder()
and acceptWalkInOrder() even though they are not useful for it. This creates
unnecessary methods and UnsupportedOperationException problems.


2) Code that follows ISP
========================
Why this follows ISP
Now each class implements only the interfaces it actually needs.
No class is forced to depend on extra methods that it does not use.

3) Easy understanding
Violation: one large interface with many unrelated methods.

Correct: split the interface into smaller, focused interfaces.

 */

interface OnlineOrder {
    void acceptOnlineOrder();
}

interface TelephoneOrder {
    void acceptTelephoneOrder();
}

interface WalkInOrder {
    void acceptWalkInOrder();
}

interface OnlinePayment {
    void payOnline();
}

interface InPersonPayment {
    void payInPerson();
}

class OnlineCustomer implements OnlineOrder, OnlinePayment {
    public void acceptOnlineOrder() {
        System.out.println("Online order accepted");
    }

    public void payOnline() {
        System.out.println("Paid online");
    }
}

class WalkInCustomer implements WalkInOrder, InPersonPayment {
    public void acceptWalkInOrder() {
        System.out.println("Walk-in order accepted");
    }

    public void payInPerson() {
        System.out.println("Paid in person");
    }
}

public class ISP {
    public static void main(String[] args){
        WalkInCustomer walCus = new WalkInCustomer();
        walCus.acceptWalkInOrder();
        walCus.payInPerson();

        OnlineCustomer onlCus = new OnlineCustomer();
        onlCus.acceptOnlineOrder();
        onlCus.payOnline();
    }
}