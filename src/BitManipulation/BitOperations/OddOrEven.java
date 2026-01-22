package BitManipulation.BitOperations;

import java.util.Scanner;

public class OddOrEven {

    public static void Check(int a){
        int bitMask=1;
        if((a & bitMask)==0){
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");int a= sc.nextInt();
        Check(a);
    }
}
