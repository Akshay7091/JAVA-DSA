package Arrays.ArraysPart2;

import static java.lang.Math.*;

public class MaxSumSubArrayPREFIXSUM {

    public static void MaxSumSub(int arr[]){
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<= prefix.length-1;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int Sum=Integer.MIN_VALUE;int sum=0;
        for(int i=0;i<= arr.length-1;i++){
            int st=i;
            for(int j=i;j<= arr.length-1;j++){
                int ed=j;
                sum= st==0? prefix[ed]: prefix[ed]-prefix[st-1];
                Sum=max(Sum,sum);
            }
        }
        System.out.print(Sum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        MaxSumSub(arr);
    }
}
