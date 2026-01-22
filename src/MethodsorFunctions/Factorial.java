package MethodsorFunctions;

import java.util.Scanner;

public class Factorial {

    public static long factorial(int a){
        if(a==0){
            return 1;
        } else if (a<0) {
            System.out.println("Not a A Valid Number");
            return -1;
        }
        else {
            long product = 1;
            for (long i = a; i > 0; i--) {
                product *= i;
            }
            return product;
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a=sc.nextInt();
        long fact=factorial(a);
        System.out.println(fact);
    }
}
