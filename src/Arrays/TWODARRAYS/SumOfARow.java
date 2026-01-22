package Arrays.TWODARRAYS;

public class SumOfARow {
    public static void Sum(int arr[][]){
        int sum=0;
        for(int i=0;i<=arr[0].length-1;i++){
            sum+=arr[1][i];
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        Sum(arr);
    }
}
