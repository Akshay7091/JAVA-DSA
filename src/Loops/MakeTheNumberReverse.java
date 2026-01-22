package Loops;

public class MakeTheNumberReverse {
    public static void main(String[] args) {
        int a=9999,lastdigit,reverse=0;
        for(int i=a;a>0;a/=10){
            lastdigit=a%10;
            reverse*=10;
            reverse+=lastdigit;

        }
        System.out.println("Reverse of the Number is: "+reverse);
    }
}
