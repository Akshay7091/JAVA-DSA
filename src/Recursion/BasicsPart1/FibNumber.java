package Recursion.BasicsPart1;

public class FibNumber {

    public static int fib(int a){
        if(a==1 || a==0){
            return 1;
        }
        return fib(a-1)+fib(a-2);
    }
    public static void main(String[] args) {
        int a=4;
        System.out.print(fib(a));
    }
}
