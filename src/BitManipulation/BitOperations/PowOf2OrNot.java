package BitManipulation.BitOperations;

import java.util.*;

public class PowOf2OrNot {

    public static void Check(int a){
        if((a & (a-1))==0){
            System.out.print("Yes");
        }
        else{
            System.out.print("no");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");int a= sc.nextInt();
        Check(a);
    }
}
