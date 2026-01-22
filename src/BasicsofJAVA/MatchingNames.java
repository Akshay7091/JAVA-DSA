package BasicsofJAVA;

import java.util.Scanner;

public class MatchingNames {

    public static boolean SameName(String ab,String ab1){
        if(ab.length()!=ab1.length()){
            return false;
        }
        for(int i=0;i<=ab.length()-1;i++){
            if(ab.charAt(i)!=ab1.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the your name: ");
        String ab= sc.next();
        System.out.print("Enter another Name: ");
        String ab1= sc.next();
        System.out.println(SameName(ab,ab1));
    }
}
