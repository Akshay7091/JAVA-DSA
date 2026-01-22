package Loops;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int a= sc.nextInt();

        if(a==2){
            System.out.println(a+" is a Prime Number");
        } else if (a==0 || a==1) {
            System.out.println(a+" is Neither Prime Nor Composite");

        } else{
            boolean IsPrime=true;
            for(int i=2;i<a;i++){
                if(a%i==0){
                    IsPrime=false;
                    break;
                }
            }
            if(IsPrime){
                System.out.println(a+" is Prime Number");
            }
            else{
                System.out.println(a+" is Not a Prime Number");
            }
        }
    }
}
