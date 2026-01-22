package OOP.Polymorphism;

public class Overloading {
    public static void main(String[] args) {
        Addition add=new Addition(); //object created
        System.out.println(add.Sum(4,5));
        System.out.println(add.Sum(3,2,5));
        System.out.print(add.Sum(2.4f,3.4f,4.6f));
    }
}

class Addition{
    public int Sum(int a,int b){ //Normal Method
        return a+b;
    }
    public int Sum(int a,int b,int c){ //Diff no of Arguments
        return a+b+c;
    }
    public float Sum(float a,float b,float c){ // Diff Datatype
        return a+b+c;
    }
}
