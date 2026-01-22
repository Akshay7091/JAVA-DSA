package Loops.Patterns;

import java.util.Scanner;

public class ButterFlyPat {

    public static void HalfUpPyramid(int a){
        for(int i=1;i<=a;i++){
            for (int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            for(int j=1;j<=((2*a)-(2*i));j++){
                System.out.print("   ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void HalfDownPyramid(int a){
        for(int i=a;i>0;i--){
            for (int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            for(int j=1;j<=((2*a)-(2*i));j++){
                System.out.print("   ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a= sc.nextInt();
        HalfUpPyramid(a);
        HalfDownPyramid(a);
        sc.close();
    }
}

