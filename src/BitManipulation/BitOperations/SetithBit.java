package BitManipulation.BitOperations;

import java.util.Scanner;

public class SetithBit {

    public static void Set(int a,int i){
        int bitMask=1<<(i-1);
        System.out.print(a | bitMask);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");int a= sc.nextInt();
        System.out.print("Enter The Index Position to set bit equal to 1: ");int i= sc.nextInt();
        Set(a,i);
    }
}
