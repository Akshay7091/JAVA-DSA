package Arrays.TWODARRAYS;

public class Spiral_Matrix {
    public static void Spiral(int arr[][]){
        int StRow=0,StCol=0,EdRow= arr.length-1,EdCol=arr[0].length-1;
        while(StRow<=EdRow && StCol<=EdCol){
            for(int j=StCol;j<=EdCol;j++){
                System.out.print(arr[StRow][j]+" ");
            }
            for(int i=StRow+1;i<=EdRow;i++){
                System.out.print(arr[i][EdCol]+" ");
            }
            for(int j=EdCol-1;j>=StCol;j--){
                System.out.print(arr[EdRow][j]+" ");
            }
            for(int i=EdRow-1;i>=StRow+1;i--){
                System.out.print(arr[i][StCol]+" ");
            }
            StRow++;StCol++;EdRow--;EdCol--;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Spiral(arr);
    }
}
