package BasicsofJAVA;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        int a= sc.nextInt(),tax;

        if(a<500000){
            tax=0;
        } else if (a>500000 && a<1000000) {
            tax=(int)(a*0.2);
        }
        else {
            tax=(int)(a*0.3);
        }
        System.out.println("Your tax is: "+tax);
    }
}
