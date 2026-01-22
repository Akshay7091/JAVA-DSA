package MethodsorFunctions;

import java.util.Scanner;

public class Palindrome {

    public static boolean IsPalin(int a){
        int rev=0;
        for(int i=a;i>0;i/=10){
            int digit=i%10;
            rev*=10;
            rev+=digit;

        }
        return rev==a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a= sc.nextInt();
        System.out.println(IsPalin(a));
        sc.close();
    }
}
