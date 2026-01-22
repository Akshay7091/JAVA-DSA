package Recursion.Backtracking;

public class NQueens {
    public static void Queen(char board[][],int row){
        if(row==board.length){
            PrintBoard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(CanBePlaced(board,row,j)){
                board[row][j]='Q';
                Queen(board,row+1);
                board[row][j]='x'; // backtracking step
            }
        }
    }

    public static boolean CanBePlaced(char board[][],int row,int col){
        /* for vertical up */
        for(int i=row-1;i>=0;i--){
           if(board[i][col]=='Q'){
               return false;
           }
       }

        // for left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //for right diagonal
        for(int i=row-1,j=col+1;i>=0 && j< board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void PrintBoard(char board[][]){
        System.out.println("------------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N=8;
        char board[][]=new char[N][N];
        for(int i=0;i< board.length;i++){
            for(int j=0;j< board[i].length;j++){
                board[i][j]='x';
            }
        }
        Queen(board,0);
    }
}
