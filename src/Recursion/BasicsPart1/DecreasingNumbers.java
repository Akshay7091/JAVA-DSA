package Recursion.BasicsPart1;

public class DecreasingNumbers {
    public static void Decrease(int a){
        if(a==0){
            System.out.print(0);
            return;
        }
        System.out.print(a + " ");
        Decrease(a-1);
    }
    public static void main(String[] args) {
        int a=10;
        Decrease(a);
    }
}
