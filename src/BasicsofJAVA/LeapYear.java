package BasicsofJAVA;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));


        String res=(x && (y||z))? "It is a Leap year": "It is not";
        System.out.println(res);
    }
}
