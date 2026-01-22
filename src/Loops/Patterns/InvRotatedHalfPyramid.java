package Loops.Patterns;

import java.util.Scanner;

public class InvRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int a= sc.nextInt();

        for(int i=1;i<=a;i++){
            for (int k=a;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=a;i>=1;i--){
            for (int k=a;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
