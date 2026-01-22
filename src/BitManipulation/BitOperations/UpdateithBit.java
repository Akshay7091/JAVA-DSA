package BitManipulation.BitOperations;

import java.util.Scanner;

public class UpdateithBit {

    public static int Clear(int a,int i){
        int bitMask=~(1<<(i-1));
        return a & bitMask;
    }
    public static void Update(int a,int i,int updt){
        a=Clear(a,i);
        int BitMask;
        BitMask=updt<<i-1;
        System.out.print(a | BitMask);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");int a= sc.nextInt();
        System.out.print("Enter The Index Position to Update: ");int i= sc.nextInt();
        System.out.print("Enter The Bit Value You Want to Update it By: ");int updt= sc.nextInt();
        Update(a,i,updt);
    }
}
