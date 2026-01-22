package Loops.Patterns;

import java.util.Scanner;

public class PyramidPat {

    public static void Pyramid(int a){
        for(int i=a;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=((2*a)-(2*i)+1);k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number: ");int a= sc.nextInt();
        Pyramid(a);
        sc.close();
    }
}
