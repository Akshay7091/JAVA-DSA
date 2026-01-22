package OOP.Inheritance;

public class Hierachical {
    public static void main(String[] args) {
        Animal myanimal=new Animal();
        System.out.println(myanimal.Breathes);
        myanimal.Eat();

        Ani ani=new Ani();

        Ani.Mammal mymammal=ani. new Mammal();
        System.out.println(mymammal.Breathes);
        mymammal.LivesOn();

        Ani.Fish myfish=ani. new Fish();
        myfish.SwimsIn();

        Ani.Bird mybird=ani. new Bird();
        mybird.FliesIn();
    }
}

class Ani{
      class Mammal extends Animal{
       boolean Breathes=true;
        void LivesOn(){
            System.out.println("Land");
        }
    }

    class Fish extends Animal{
        void SwimsIn(){
            System.out.println("Water");
        }
    }

    class Bird extends Animal{
        void FliesIn(){
            System.out.print("Sky");
        }
    }
}
