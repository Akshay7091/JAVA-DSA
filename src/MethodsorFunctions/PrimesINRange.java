package MethodsorFunctions;

import java.util.Scanner;

public class PrimesINRange {


    public static boolean IsPrime(int a){
        if(a<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void Range(int a){
        int count=0;
        for(int i=2;i<=a;i++){
            if(IsPrime(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a= sc.nextInt();
        Range(a);
    }
}
