package Arrays.ArraysPart2;

public class ContainerWithMostWaterBRUTEFORCE {
    public static void MostWater(int arr[]){
        int MaxArea=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j= i+1;j<= arr.length-1;j++){
                int width=j-i;
                int height=Math.min(arr[i],arr[j]);
                MaxArea=Math.max(MaxArea,height*width);
            }
        }
        System.out.print(MaxArea);
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        MostWater(arr);
    }
}
