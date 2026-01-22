package BitManipulation.BitOperations;

import java.util.Scanner;

public class FastExponentiation {
    public static void Expo(int a,int pow){
        int ans=1;
        while(pow>0){
            if((pow & 1)==1){
                ans=ans * a;
            }
            a=a*a;
            pow=pow>>1;
        }
        System.out.print(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");int a= sc.nextInt();
        System.out.print("Enter the Power: ");int pow= sc.nextInt();
        Expo(a,pow);
    }
}
