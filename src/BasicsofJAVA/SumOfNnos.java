package BasicsofJAVA;
import java.util.Scanner;
public class SumOfNnos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int a= sc.nextInt(),sum=0;
        for(int i=0;i<=a;i++){
            sum+=i;
        }
        System.out.print("The sum of the given number is: "+sum);
    }
}
