package Recursion.BasicsPart1;

public class XToThePowerOfN {
    public static int Power(int x,int n){
        if(n==1){
            return x;
        }
       return x*Power(x,n-1);
    }
    public static void main(String[] args) {
        int x=2,n=5;
        System.out.print(Power(x,n));
    }
}
