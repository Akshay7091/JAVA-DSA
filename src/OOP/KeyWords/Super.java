package OOP.KeyWords;

public class Super {
    public static void main(String[] args) {
        Horse myh=new Horse();
        System.out.print(myh.color);
    }
}

class Animalllll{
    static String color;
    Animalllll(){
        System.out.println("Animal Constructor");
    }
}

class Horse extends Animalllll{
    Horse(){
        super.color="Brown";
        System.out.println("Horse Constructor");
    }
}
