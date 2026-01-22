package Arrays.ArraysPart2;

public class ContainerWithMostWaterTWOPOINTER {
    public static void MostWater(int arr[]){
        int st=0,ed= arr.length-1,Maxwt=0;
        while (st<ed){
            int height=Math.min(arr[st],arr[ed]),width=ed-st;
            Maxwt=Math.max(Maxwt,height*width);
            if(arr[st]<arr[ed]){
                st++;
            }
            else {
                ed--;
            }
        }
        System.out.print(Maxwt);
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        MostWater(arr);
    }
}
