package OOP.Polymorphism;

import OOP.Inheritance.Animal;

public class Overriding {
    public static void main(String[] args) {
        Animal myanimal=new Animal();
        Aniii ani=new Aniii();
        Aniii.Deer mydeer= ani.new Deer();
        myanimal.Eat();
        mydeer.Eat();
    }
}

class Aniii{
    class Deer extends Animal{
        @Override
        public void Eat() {
            System.out.println("Eats Only grass");
        }
    }
}
