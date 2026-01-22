package BitManipulation.BitOperations;

import java.util.Scanner;

public class GetithBit {

    public static void Get(int a,int i){
        int BitMask=1<<i-1; //since 1 is 001 and when we do 1<<i it will become 100 but and the one's index becomes 3 not i=2 that's why we minus 1 from i
        if((a & BitMask)==0){
            System.out.print("0");
        }
        else{
            System.out.print("1");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");int a= sc.nextInt();
        System.out.print("Enter The Index Position: ");int i= sc.nextInt();
        Get(a,i);
    }
}
