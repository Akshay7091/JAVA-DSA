package BitManipulation.BitOperations;

import java.util.Scanner;

public class ClearLastiBits {

    public static void Clear(int a,int i){
        int bitMask=(~0)<<i;
        System.out.print(a & bitMask);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");int a= sc.nextInt();
        System.out.print("Enter The Index Position to Clear from: ");int i= sc.nextInt();
        Clear(a,i);
    }
}
