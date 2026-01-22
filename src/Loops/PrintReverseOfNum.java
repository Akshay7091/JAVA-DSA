package Loops;

public class PrintReverseOfNum {
    public static void main(String[] args) {
        int a=10899,lastdigit;
        for(int i=a;a>0;a/=10){
            lastdigit=a%10;
            System.out.print(lastdigit);
        }
    }
}
