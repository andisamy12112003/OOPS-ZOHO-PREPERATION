/*
========================= key concepts =====================
Abstraction

======================= next topic ========================


Abstraction:
Abstraction means showing only the important features and hiding the internal details.
In Java, it answers the question: what should an object do?

Example: A Car has start() and stop() methods, but you do not need
to know the engine’s internal working to use it. That is abstraction.

Abstract inheritance :
    * can't instantiate ( create an object ).
    * must use the abstract key word.
    * abstract method only we can declare  but not specify a body.
    * abstract method must be overriding the method in which extends class extended.
    * abstract method must be inside the abstract class.

 */

abstract class Remote {
    abstract void powerOn();
}

class SmartTVRemote extends Remote {
    void powerOn() {
        System.out.println("Smart TV turned on");
    }
}

class AcRemote extends Remote{
    void powerOn(){
        System.out.println("Ac turned On");
    }
}

public class Abstraction {
    public static void main(String[] args){
        Remote tv = new SmartTVRemote();
        Remote ac = new AcRemote();
        ac.powerOn();
        tv.powerOn();
    }
}
