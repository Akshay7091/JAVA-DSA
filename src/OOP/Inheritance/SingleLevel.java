package OOP.Inheritance;

public class SingleLevel {
    public static void main(String[] args) {
        Animal cat=new Animal();
        cat.Eat();

        Fish shark=new Fish();
        shark.Eat();
        shark.Swim();
    }
}

class Fish extends Animal{
    int fins;
    public void Swim(){
        System.out.println("Swims");
    }
}