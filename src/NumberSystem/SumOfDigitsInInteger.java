package NumberSystem;

import java.util.Scanner;

public class SumOfDigitsInInteger {

    public static int SumOfDigits(int a){
        int sum=0;
        for(int i=a;i>0;i/=10){
            int digit=i%10;
            sum+=digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");int a= sc.nextInt();
        System.out.println("The Sum of the Digits of Entered Numbers is: "+SumOfDigits(a));
        sc.close();
    }
}
