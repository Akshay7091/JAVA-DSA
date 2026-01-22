package OOP.Inheritance;

public class Hybrid {
    public static void main(String[] args) {
        Anii ani=new Anii();
        Anii.Bird mybird=ani .new Bird();

        Anii.Ostrich myostrich=ani .new Ostrich();

        Anii.Fish myfish=ani. new Fish();

        mybird.Fly();

        myostrich.Fly();

        myfish.Swim();
    }
}

class Anii{
    class Bird extends Animal{
        public void Fly(){
            System.out.println("Bird Flies");
        }
    }

    class Fish extends Animal{
        public void Swim(){
            System.out.println("Fish Swims");
        }
    }

    class Ostrich extends Bird{
        @Override //Method Overriding
        public void Fly() {
            System.out.println("Flies at low Altitude");
        }
    }
}
