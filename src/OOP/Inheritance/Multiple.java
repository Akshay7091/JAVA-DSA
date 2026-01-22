package OOP.Inheritance;

public class Multiple {
    public static void main(String[] args) {
        bear myb=new bear();
        myb.EatMeat();
        myb.EatPlants();

        elephant mye=new elephant();
        mye.EatPlants();
    }
}

interface Herbivorous{
    void EatPlants();
}

interface Carnivore{
    void EatMeat();
}

class bear implements Herbivorous,Carnivore{
    @Override
    public void EatMeat() {
        System.out.println("Eats Meat");
    }

    @Override
    public void EatPlants() {
        System.out.println("Eats PLants");
    }
}

class elephant implements Herbivorous{
    @Override
    public void EatPlants() {
        System.out.println("Eats Plant");
    }
}
