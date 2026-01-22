package BasicsofJAVA;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a=sc.nextInt();
        System.out.print("Enter number 2: ");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.print("Addition is: ");
        System.out.println(sum);
    }
}
