package MethodsorFunctions.MethodOverloading;

import java.util.Scanner;

public class UsingParameters {

    public static int sum(int a,int b){
        return a+b;
    }
// THIS IS CALLED METHOD OVERLOADING WHERE WE CAN NAME THE SAME NAME FOR
// MULTIPLE METHODS AS LONG AS THEIR NO OF PARAMETERS ARE SAME(LIKE IN THIS CODE) OR
// THEY HAVE SAME DATATYPE
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,7));
    }
}
