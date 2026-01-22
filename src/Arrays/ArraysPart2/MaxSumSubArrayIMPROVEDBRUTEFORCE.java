package Arrays.ArraysPart2;

import static java.lang.Math.*;

public class MaxSumSubArrayIMPROVEDBRUTEFORCE {

    public static int MaxSumSub(int arr[]){
        int Sum=Integer.MIN_VALUE;int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                Sum=max(sum,Sum);
            }
        }
        return Sum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        System.out.print(MaxSumSub(arr));
    }
}
