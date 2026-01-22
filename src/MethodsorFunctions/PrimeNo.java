package MethodsorFunctions;
import java.util.Scanner;
import java.lang.Math;

public class PrimeNo {

    public static boolean Prime(int a){
        if(a==2) {
            return true;
        }
        for(int i=2;i<=Math.sqrt(a);i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a= sc.nextInt();
        System.out.println(Prime(a));
    }
}
