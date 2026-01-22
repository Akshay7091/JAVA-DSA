package Arrays.ArraysPart2;
import static java.lang.Math.*;
public class RainWaterTrapping {
// LEETCODE NO 22
    public static void SumRainWater(int arr[]){
        int LeftMaxBoundry[]=new int[arr.length], RightMaxBoundry[]=new int[arr.length];
        LeftMaxBoundry[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            LeftMaxBoundry[i]=max(LeftMaxBoundry[i-1],arr[i]);
//            System.out.println(LeftMaxBoundry[i]);
        }
        RightMaxBoundry[arr.length-1]=arr[arr.length-1];
        for(int i= LeftMaxBoundry.length-2;i>=0;i--){
            RightMaxBoundry[i]=max(RightMaxBoundry[i+1],arr[i]);
//           System.out.println(RightMaxBoundry[i]);
        }
        int Maxht;int MaxWat=0;
        for(int i=1;i<arr.length-1;i++){ 
            Maxht=min(LeftMaxBoundry[i],RightMaxBoundry[i]);
            int max=Maxht-arr[i];
            MaxWat+=max;
        }
        System.out.println(MaxWat);
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        SumRainWater(arr);
    }
}
