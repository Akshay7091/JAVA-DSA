package Recursion.BasicsPart2;

public class GridWays {

    public static int Ways(int n,int m,int d,int r){
        if(d==n-1 || r==m-1){
            return 1;
        }

        return Ways(n,m,d+1,r) + Ways(n,m,d,r+1);
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.print(Ways(n,m,0,0));
    }
}
