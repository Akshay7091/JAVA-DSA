package Arrays.Strings;

import java.util.Scanner;

public class SubStrings {

    public static void Sub(String str,int st,int ed){
        for(int i=st;i<ed;i++){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        Scanner sc=new Scanner(System.in);
        int st= sc.nextInt();int ed= sc.nextInt();
        System.out.println(str.substring(st,ed)); //BUILT-IN Function to print any substring present in the string
        Sub(str,st,ed);
    }
}
