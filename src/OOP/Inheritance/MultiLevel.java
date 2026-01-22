package OOP.Inheritance;

public class MultiLevel {
    public static void main(String[] args) {
        Animal myanimal=new Animal();
        System.out.println(myanimal.Breathes);
        myanimal.Eat();

        Anim anim = new Anim();

        Anim.Mammal mymammal=anim.new Mammal(4);
        System.out.println(mymammal.legs);
        mymammal.Walks();

        Anim.Dog mydog=anim.new Dog();
        mydog.Barks();

    }
}

class Anim{
    class Mammal extends Animal{
        int legs;
        Mammal() {} // need to specify because when dog object is created java first calls no argument constructor

        Mammal(int legs){
            this.legs=legs;
        }
        protected void Walks(){
            System.out.println("Walking");
        }
    }

    class Dog extends Mammal {
        protected void Barks(){
            System.out.println("barking");
        }
    }
}


