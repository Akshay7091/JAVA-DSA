package Arrays.Sorting;

public class CountingSort {

    public static void Counting(int arr[]){
       int MaxRange=Integer.MIN_VALUE;
        for(int i=0;i<= arr.length-1;i++){
            MaxRange=Math.max(arr[i],MaxRange);
        }
        int arr1[]=new int[MaxRange+1];
        for(int i=0;i<= arr.length-1;i++){
            arr1[arr[i]]++;
        }
        for(int val:arr1){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        Counting(arr);
    }
}
