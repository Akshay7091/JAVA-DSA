package Arrays.ArraysPart2;
import static java.lang.Math.*;

public class MaxSumSubArrayKANADESALGO {
    public static int MaxSumSub(int arr[]){
        int Sum=arr[0],sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=max(arr[i],sum+arr[i]); // handles if all nos in array are negative also
            Sum=max(Sum,sum);
        }
        return Sum;
    }
    public static void main(String[] args) {
        int arr[]={-4, -2, -7, -3};
        System.out.println(MaxSumSub(arr));
    }
}
