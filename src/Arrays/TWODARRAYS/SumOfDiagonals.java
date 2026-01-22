package Arrays.TWODARRAYS;

public class SumOfDiagonals {

    public static void Diagonal(int arr[][]){ //O(n^2)
        int DiagonalSum =0;
        for(int i=0;i<= arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                if(j==i){
                    DiagonalSum +=arr[i][j];
                }
                else if(i+j== arr.length-1){  //In a square matrix of size n x n, the elements
                                         // of the secondary diagonal are the ones where the sum
                                         // of the row index i and column index j is equal to n - 1.
                    DiagonalSum+=arr[i][j];
                }
            }
        }
        System.out.println(DiagonalSum);
    }

    public static void Diagonall(int arr[][]){ //O(n)
        int DiagonalSum=0;
        for(int i=0;i<= arr.length-1;i++){
            DiagonalSum+=arr[i][i]; //Primary Diagonal

            if(i!= arr[0].length-1-i){// the if condition checks whether the center element of matrix which is 5 is not getting counted in sec diagonal also
                                     //since the condition for secondary diagonal is
                                    // i+j=arr.length-1
                                    //(((in here arr.length is equal to arr[0].length cuz this is square matrix)))
                                    // we can say j=arr.length-1-i
                DiagonalSum+=arr[i][arr.length-1-i];
            }
        }

    }
    public static void main(String[] args) {
        int arr[][]={{1, 2, 9},
                     {4, 5, 6},
                     {7, 8, 3}};
        Diagonal(arr);
        Diagonall(arr);
    }
}
