package Recursion.BasicsPart1;

public class SumOfFirstNNaturalNos {

    public static int Sum(int a){
        if(a==0){
            return 0;
        }
        return a+Sum(a-1);
    }
    public static void main(String[] args) {
        int a=10;
        System.out.print(Sum(a));
    }
}
