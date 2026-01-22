package BitManipulation.BitOperations;

import java.util.Scanner;

public class CountSetNos {
    public static void Count(int a){
        int count=0;
        while(a>0){
             a=a & (a-1);                            //            int bitMask=1;
             count++;                               //            if((a & bitMask)==1){
                                                   //                count++;
                                                  //            }
                                                 //            a=a>>1;
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");int a= sc.nextInt();
        Count(a);
    }
}
