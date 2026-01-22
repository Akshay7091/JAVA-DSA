package BasicsofJAVA;
import java.util.Scanner;
public class MaxOf3NoUsingLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd No: ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd No: ");
        int c=sc.nextInt();
        if(b>a){
            if(b>c){
                System.out.print("Largest No is: "+b);
            }
            else{
                System.out.print("Largest No is: "+c);
            }
        }
        else{
            if(a>c){
                System.out.print("Largest No is: "+a);
            }
            else{
                System.out.print("Largest No is: "+c);
            }
        }
    }
}
