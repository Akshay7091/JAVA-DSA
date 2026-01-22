// Given a 2 by n board and tiles of size "2 by 1"
//count the no of ways to tile the given board using
//2 by 1 tiles
//REMEMBER: A Tile can either be placed horizontally or vertically
package Recursion.BasicsPart2;

public class TilingProblem {

    public static int Tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        return Tiling(n-1) +Tiling(n-2);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.print(Tiling(n));
    }
}
