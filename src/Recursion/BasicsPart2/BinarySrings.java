package Recursion.BasicsPart2;

public class BinarySrings {

    public static void Binary(String str,int lastplace,int n){
        if(n==0){
            System.out.println(str);
            return;
        }
        Binary(str+"0",0,n-1);
        if(lastplace==0){
            Binary(str+"1",1,n-1);
        }
    }
    public static void main(String[] args) {
        Binary("",0,3);
    }
}
