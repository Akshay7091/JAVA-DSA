package Loops;

import java.util.Scanner;

public class BreakQue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(;true;){
            int a= sc.nextInt();
            if(a%10==0){
                break;
            }
        }
    }
}
