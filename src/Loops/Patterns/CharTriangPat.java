package Loops.Patterns;

import java.util.Scanner;

public class CharTriangPat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a= sc.nextInt();

//        for(int i=1;i<=a;i++){     THIS HELPS US TO PRINT:  A
//            for(char j='A';(int)j<=i+64;j++){               AB
//                System.out.print(j);                        ABC
//            }                                               ABCD
//            System.out.println();
//        }

        char ch='A';
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
