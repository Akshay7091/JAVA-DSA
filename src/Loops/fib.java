package Loops;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a= sc.nextInt();
        int t1=0,t2=1,nextterm;
        for(int i=1;i<=a;i++){
            System.out.print(t1+" ");
            nextterm=t1+t2;
            t1=t2;t2=nextterm;
        }
    }
}
