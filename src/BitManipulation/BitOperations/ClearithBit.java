package BitManipulation.BitOperations;

import java.util.Scanner;

public class ClearithBit {

    public static void Clear(int a,int i){
        int bitMask=~(1<<(i-1));
        System.out.print(a & bitMask);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");int a= sc.nextInt();
        System.out.print("Enter The Index Position to Clear: ");int i= sc.nextInt();
        Clear(a,i);
    }
}
