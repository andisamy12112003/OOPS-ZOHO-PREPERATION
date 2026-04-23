package OOPSPillars;// ===========  Key Concepts ===========
// OOPSPillars.Inheritance
// single OOPSPillars.Inheritance (support java)

// =========== Next Topic =============
//multilevel inheritance (support java)


/*
OOPSPillars.Inheritance - one child class or subclass can use data or properties and method from inherited class.
              like the parent all method and properties can use the child class

Single OOPSPillars.Inheritance - the one child class inherits only one parent class
*/

// ======== Diagram =========
//        Class A
//           |
//           v
//        Class B



class Parents { // parent class
    private String motherId  = "M009732";
    private String mother  = "Kathammal A";

    private String fatherId  = "F002321";
    private String father = "Andikkalai P";

    public void getMotherNameAndId(){
        System.out.println("Mother Name and Id  : " + mother + " " + motherId);
    }

    public void getFatherNameAndId(){
        System.out.println("OOPSPillars.Father Name and Id  : " + father + " " + fatherId);
    }
}

class Child1 extends Parents { // child class
    private String id  = "M012232";
    private String name  = "Andisamy A";

    public void getChildNameAndId() {
        System.out.println("Name And ID : "+ name + " " + id);
    }
}

public class Inheritance {
    public static void main(String arg[]){

        Parents chl1 = new Child1(); // the child class inherits the parents class
        chl1.getFatherNameAndId(); // get father name and id
        chl1.getMotherNameAndId(); // get mother name and id

    }
}
