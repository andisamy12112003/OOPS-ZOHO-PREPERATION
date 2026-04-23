// ============== key concepts =============
// Hierarchical inheritance

// ============== next topic ===============
// multiple inheritance ( not support but we can implements in java)

/*

    Hierarchical inheritance -
    In Java means multiple child classes inherit from
    the same parent class. It is useful when several classes share common features,
    but each also has its own special behaviour.


=============   diagram ================

          Class A(no inherit)
                / | \
               v  v  v
              B   C  D
        (B,C,D inherit Class A)

*/

class Animal {
    void eat(){
        System.out.println("Animal is eats...");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Bow Bow");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow Meow");
    }
}

class Lion extends Animal{
    void sound(){
        System.out.println("Roarrrrr");
    }
}

public class HierarchicalInheritance {
    public static void main(){
        Cat cat = new Cat();
        cat.eat();
        cat.sound();
    }
}
