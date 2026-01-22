package BasicsofJAVA;
import java.util.Scanner;
import java.lang.Math;

public class PrimeNo {
    public static void main(String[] args) {
        boolean IsPrime=true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int a= sc.nextInt();
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                IsPrime=false;
                break;
            }
        }
        if(!IsPrime){
            System.out.println("Not a Prime number");
        }
        else{
            System.out.println("Prime Number");
        }
    }
}
