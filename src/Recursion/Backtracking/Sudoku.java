package Recursion.Backtracking;

public class Sudoku {
    public static boolean CanbePlaced(int board[][],int row,int num,int col){
        //row searching
        for(int i=0;i<board.length;i++){
            if(board[i][col]==num){
                return false;
            }
        }

        //col searching
        for(int j=0;j< board.length;j++){
            if(board[row][j]==num){
                return false;
            }
        }

        //3x3 grid searching

        return true;
    }
    public static boolean IsSolvable(int board[][],int row,int col){
        if(row==9){
            return true;
        }
        if(col==9){
            return IsSolvable(board,row+1,0);
        }
        if(board[row][col]!=0){
            return IsSolvable(board,row,col+1);
        }
        for(int i=1;i<=9;i++){
           if(CanbePlaced(board,row,i,col)){
               board[row][col]=i;
               if(IsSolvable(board,row,col+1)){
                   return true;
               }
               board[row][col]=0;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        int board[][]={{0,0,8,0,0,0,0,0,0},{4,9,0,1,5,7,0,0,2},{0,0,3,0,0,4,1,9,0},
                       {1,8,5,0,6,0,0,2,0},{0,0,0,0,2,0,0,6,0},{9,6,0,4,0,5,3,0,0},
                       {0,3,0,0,7,2,0,0,4},{0,4,9,0,3,0,0,5,7},{8,2,7,0,0,9,0,1,3}};
        System.out.print(IsSolvable(board,0,0));
    }
}
