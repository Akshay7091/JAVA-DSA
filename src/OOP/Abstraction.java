package OOP;

public class Abstraction {
    public static void main(String[] args) {
        Animall myhorse=new Horse();

        myhorse.Eat();
        myhorse.Walk();

        Animall mychicken=new Chicken();
        mychicken.Eat();
        mychicken.Walk();
    }
}

abstract class Animall{
    void Eat(){
        System.out.println("Eats");
    }
    abstract void Walk(); //Abstract Method
}

class Horse extends Animall{
    @Override
    void Walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animall{
    @Override
    void Walk() {
        System.out.print("Walks on 2 Legs");
    }
}
