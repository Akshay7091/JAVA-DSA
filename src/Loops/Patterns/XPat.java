package Loops.Patterns;

import java.util.Scanner;

public class XPat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a= sc.nextInt();

        for(int row = 1; row <=a; row++){
            for(int col = 1; col <=a; col++){
                if(row == col ||(a- row +1)== col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
