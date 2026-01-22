package NumberSystem;

import java.util.Scanner;

public class BinToDec {

    public static int Dec(int a){
        int powr =1,sum=0;
        for(int i=a;i>0;i/=10){
            int digit=i%10;
            sum+=(digit* powr);  //WW ALSO CAN SAY sum+=(digit* Math.pow(2,powr)) WHERE int powr=0
            powr *=2;            //WHICH MEANs DIGIT * 2 TO THE POWER-OF(POW) THE VALUE OF powr and then we do powr++
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Binary number: ");
        int a= sc.nextInt();
        System.out.println(Dec(a));
    }
}
