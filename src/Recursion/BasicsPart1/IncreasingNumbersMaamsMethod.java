package Recursion.BasicsPart1;

public class IncreasingNumbersMaamsMethod {

    public static void Increasing(int a){
        if(a==0){
            System.out.print(0+" ");
            return; // when a becomes zero and the above print line gets executed then return is called
        }
        Increasing(a-1); //the return called will come here and execute this line's below operation/s
        System.out.print(a+" ");
    }
    public static void main(String[] args) {
        int a=6;
        Increasing(a);
    }
}
