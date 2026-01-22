package Arrays.TWODARRAYS;

public class Transpose {
    public static void Transpose(int arr[][]){
        int trans[][]=new int[arr[0].length][arr.length]; //We assigned opposite values of matrix
                                                          // n*m to the new matrix since it is transposed
        for(int i=0;i<= arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){

                   trans[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<= trans.length-1;i++){
            for(int j=0;j<=trans[0].length-1;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{11,12,13},{21,22,23}};
        Transpose(arr);
    }
}
