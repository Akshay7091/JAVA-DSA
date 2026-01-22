package BasicsofJAVA;
import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter What you want: ");
        int a= sc.nextInt();
        switch (a){
            case 1: System.out.println("Pizza");
            break;
            case 2: System.out.println("Burger");
            break;
            case 3: System.out.println("Pasta");
            break;
            default: System.out.println("Invalid Entry");
        }
    }
}
