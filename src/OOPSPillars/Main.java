package OOPSPillars;
// ======  Key concepts  ========

// class
// object
// access modifiers
//properties or data

// ========= next topic ========

// four pillars of OOPS - encapsulation , inheritance , polymorphism , abstraction

/*
    import class:
        syntax:
            import pakageName.className;

========================= Access modifier ==========================
reference video - https://youtu.be/XVa1BGP1YPk?si=3U38vHaf5KdWTTm-

    public - accessible anywhere inside and outside the class.
            - must contain only one public class in the folder.

    private - only accessible for inside the class.
            - directly can't modify the data in object method.
            - directly can't accessible directly in subclass.

   protected - accessible and modify only same package and subclass
             - we can't access the another package class properties directly but,
               we can access the after extends the class.

   default - no keyword(if not mention any keyword is take default modifier)
           - accessible only within the package.

    */

class Car { // class - this is blueprint for create an object

   private String carBrand = "BMW";
   private String carColor = "RED";
   private String carModel = "BMW B6";

   void getCarBrand(){ // method - the action can perform objects
       System.out.println(carBrand);
   }

    void getCarColor(){
        System.out.println(carColor);
    }

}

class Main {
    public static void main(String arg[]){

        Car car1 = new Car(); // object - an actual thing made from class

        car1.getCarBrand();   // access the car1 getCarBrand() object method
        car1.getCarColor();
    }
}
