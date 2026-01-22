package Recursion.Backtracking;

public class RatNdMaze {

    public static int Ways(int maze[][],int x,int y,boolean Visited[][],String curr){
        if(x== maze.length-1 && y== maze.length-1){
            maze[x][y]=2;
            System.out.println("------------WAYS-----------");
            Printmaze(maze);
            System.out.println(curr);
            return 1;
        }
        int total=0;
        if(x<0 || y<0 || x>=maze.length || y>= maze.length ){
            return 0;
        }
        if(maze[x][y]==0 || Visited[x][y]){
            return 0;
        }
        else{
            maze[x][y]=2;
            Visited[x][y]=true;
            total+=Ways(maze,x,y+1,Visited,curr+'R');
            total+=Ways(maze,x+1,y,Visited,curr+'D');
            total+=Ways(maze,x-1,y,Visited,curr+'U');
            total+=Ways(maze,x,y-1,Visited,curr+'L');
            maze[x][y]=1;
            Visited[x][y]=false;
        }

        return total;
    }
    public static void Printmaze(int maze[][]){
        for(int i=0;i< maze.length;i++){
            for(int j=0;j< maze.length;j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][] = { { 1, 1, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
        boolean Visited[][]=new boolean[maze.length][maze.length];
        System.out.print(Ways(maze,0,0,Visited,""));
    }
}
