package NumberSystem;

import java.util.Scanner;

public class DecToBin {

    public static int Dec(int a){
        int reminder,Sum=0,pow=1;
        for(int i=a;i>0;i/=2){
            reminder=i%2;
            Sum+=(reminder*pow);
            pow*=10;
        }
        return Sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Decimal Number: ");
        int a= sc.nextInt();
        System.out.println(Dec(a));
    }
}
