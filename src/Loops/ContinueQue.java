package Loops;

import java.util.Scanner;

public class ContinueQue {
    public static void main(String[] args) {
//        Display all the numbers entered by user except multiples of 10
        Scanner sc=new Scanner(System.in);
        for(;true;){
            System.out.print("Enter the number: ");
            int a= sc.nextInt();
            if(a%10==0){
                continue;
            }
            else{
                System.out.println("You've Entered: "+a);
            }
        }
    }
}
