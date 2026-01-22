package Recursion.BasicsPart1;

public class IncreasingNumbersMyMethod {

    public static void Increasing(int a,int b){
        if(b==0){
            System.out.print(a);
            return;
        }
        if(a-b==1){
            System.out.print(0+" ");
        }
        System.out.print(a-b +" ");
        Increasing(a,b-1);

    }
    public static void main(String[] args) {
        int a=6,b=a-1;
        Increasing(a,b);
    }
}
