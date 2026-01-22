//Given n friends, each one can remain or
//can be paired up with some other friend. each friend can be paired up only once
//find the total number of ways in which friends can remain single or can be paired up

package Recursion.BasicsPart2;

public class PairingProblem {
    public static int test(int n){
        if(n==1 || n==2){
            return n;
        }

        return test(n-1) + (n-1) * test(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.print( test(n));
    }
}
