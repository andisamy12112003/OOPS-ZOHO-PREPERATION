package OOPS_Pillars;// =========== Key Topics =========
// OOPSPillars.Encapsulation

// =========== next topic =========

// OOPSPillars.Inheritance
// OOPSPillars.Inheritance types - java supporting inheritance (single , multilevel , hierarchical,
//                     multiple ( java not supporting but, we can implement with use of interface )
//                     , hybrid(diamond problem) )

/*
OOPSPillars.Encapsulation
    - wrapping inside the class all data or properties and methods with use of access modifier
*/

class Employee {
    private String employeeID = "E02879" ;
    private String employeeName = "Andisamy A";
    private String employeeDOB = "12/11/2003";
    
    public void getEmployeeNameAndID(){
       System.out.println("OOPSPillars.Employee ID : " + employeeID);
       System.out.println("OOPSPillars.Employee Name : " + employeeName);
    }

}

public class Encapsulation {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.getEmployeeNameAndID();
 }
}