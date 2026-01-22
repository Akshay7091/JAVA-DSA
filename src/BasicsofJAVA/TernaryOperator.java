package BasicsofJAVA;
import java.util.*;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String larger=(marks>=33)? "pass":"fail";
        System.out.println(larger);
    }
}
