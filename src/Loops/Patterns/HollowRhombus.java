package Loops.Patterns;

import java.util.Scanner;

public class HollowRhombus {
    public static void Rhombus(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++){
                if(i==a || i==1 || j==a || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");int a= sc.nextInt();
        Rhombus(a);
        sc.close();
    }
}
