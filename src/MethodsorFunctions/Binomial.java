package MethodsorFunctions;

import java.util.Scanner;

public class Binomial {

    public static int Factorial(int n){
        int product=1;
        for(int i=n;i>0;i--){
            product*=i;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n= sc.nextInt();
        System.out.print("Enter the r: ");
        int r= sc.nextInt();
        int nr=n-r;
        int nfact=Factorial(n),rfact=Factorial(r),nrfact=Factorial(nr);
        int binomial=(nfact)/(rfact*nrfact);
        System.out.println("Binomial of the given Number is: "+binomial);
    }
}
