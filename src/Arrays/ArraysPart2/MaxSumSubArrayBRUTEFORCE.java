package Arrays.ArraysPart2;

import static java.lang.Math.*;

public class MaxSumSubArrayBRUTEFORCE {

    public static int MaxSumSub(int arr[]){
        int Sum=Integer.MIN_VALUE;
        for(int i=0;i<= arr.length-1;i++){
            int st=i;
            for(int j=i;j<= arr.length-1;j++){
                int ed=j;int sum=0;
                for(int k=st;k<=ed;k++){
                    sum+=arr[k];
                }
                Sum=max(Sum,sum);
            }
        }
        return Sum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        System.out.print(MaxSumSub(arr));
    }
}
