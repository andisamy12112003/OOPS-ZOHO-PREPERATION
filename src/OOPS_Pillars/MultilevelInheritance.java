package OOPS_Pillars;// ===========  Key Concepts ===========
// multilevel OOPSPillars.Inheritance (support java)

// =========== Next Topic =============
// hierarchical inheritance (support java)

/*
multilevel OOPSPillars.Inheritance
        - Multilevel inheritance in Java means one class inherits from another class,
        and that class inherits from a third class, forming a chain like A -> B -> C.
       which class is you will define in object creation that class and inherited class is given all inside methods and properties .
*/

// ============= Diagram ================
//              A (no inherit)
//              |
//              v
//              B (inherit A class)
//              |
//              v
//              C (inherit B and C class)


class GrandFather { // class A
    private String grandFatherId  = "F002121";
    private String grandFather = "periyakarupan P";

    public void getGrandFatherNameAndId(){
        System.out.println("Grand OOPSPillars.Father Name and Id  : " + grandFather + " " + grandFatherId);
    }
}

class Father extends GrandFather { // class B
    private String FatherId  = "M012123";
    private String FatherName  = "Andikkalai A";

    public void getFatherNameAndId() {
        System.out.println(" OOPSPillars.Father Name And ID : "+ FatherName + " " + FatherName);
    }
}

class GrandChild extends Father { // class C
    private String id  = "M012122";
    private String name  = "Andisamy A";

    public void getChildNameAndId() {
        System.out.println("Grand Child Name And ID : "+ name + " " + id);
    }
}


public class MultilevelInheritance {
    public static void main(String arg[]){

        GrandChild chl1 = new GrandChild(); // grandchild class inherits grandfather and father
        chl1.getGrandFatherNameAndId();
        chl1.getFatherNameAndId();
        chl1.getChildNameAndId();

        GrandFather chl2 = new GrandChild();
        chl2.getGrandFatherNameAndId();
//        chl2.getGrandChildNameAndId();  ( if your initialize with grandfather and reference class name grandchild 
//                                  you can't to access the getGrandChildNameAndId() method.
//                                  because the OOPSPillars.GrandFather class not inherits any class )
    }
}
