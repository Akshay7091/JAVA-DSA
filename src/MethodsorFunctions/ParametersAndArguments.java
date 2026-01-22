package MethodsorFunctions;

public class ParametersAndArguments {

    public static int Sum(int a,int b){   // the numbers we create while
                                         // creating method are called parameters
        return a+b;
    }
    public static void main(String[] args) {
        int a=9,b=10;
        System.out.println(Sum(a,b)); // the values we pass to method are called
                                      //arguments
    }
}
