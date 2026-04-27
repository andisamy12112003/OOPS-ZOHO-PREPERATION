package DesignPattern;

class Animal {
    void eat(){
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Park...");
    }
}

class Lion extends Dog{
    void sound(){
        System.out.println("Lion rorrr");
    }
}


class MultiThread{
    public static void main(){
        Animal f = new Lion();
        f.eat();

    }
}

