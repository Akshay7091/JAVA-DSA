package OOP;

public class ClassesObjects {
    public static void main(String[] args) {
        Car myCar=new Car(); //Object is Created which name is myCar
        myCar.Color="blue";
        myCar.speed=69;
        myCar.drive(); //Method is Called
        System.out.println();
        System.out.println(myCar.Color);
        System.out.print(myCar.speed);
    }
}

//This is Class
class Car{
    int speed;
    String Color;
    void drive(){
        System.out.print("Car is being drove");
    }
}