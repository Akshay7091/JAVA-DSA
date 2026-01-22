package Loops.Patterns;

import java.util.Scanner;

public class DiamondPat {

    public static void Diamond(int a){
        for(int i=a;i>0;i--){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(a*2)-(i*2)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=a;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(a*2)-(i*2)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Number: ");int a= sc.nextInt();
        Diamond(a);
        sc.close();
    }
}
