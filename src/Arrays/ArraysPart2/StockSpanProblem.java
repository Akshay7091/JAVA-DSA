package Arrays.ArraysPart2;

public class StockSpanProblem {

   protected static int PrevHigh(int arr[],int curr){
       for(int i=curr-1;i>=0;i--){
           if(arr[i]>arr[curr]){
               return i;
           }
       }
       return -1;
   }
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,85,100};
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int prevmax=PrevHigh(arr,i);
            res[i]=i-prevmax;
        }

        for(int val:res){
            System.out.print(val+" ");
        }
    }
}
