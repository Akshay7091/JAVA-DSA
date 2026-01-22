package MethodsorFunctions.MethodOverloading;

public class UsingDataTypes {

    public static float sum(float a,float b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

// METHOD OVERLOADING IS DONE USING DIFF DATATYPES AS WELL AS DIFF NO OF PARAMETERS
    public static void main(String[] args) {
        System.out.println(sum(5.7f,6.4f));
        System.out.println(sum(4,5,6));
    }
}
