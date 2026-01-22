package Arrays.Sorting;

public class SelectionSort {

    public static void Selection(int arr[]){
        for(int i=0;i<= arr.length-2;i++){
            int Smallest=i;
            for(int j=i+1;j<= arr.length-1;j++){
               if(arr[Smallest]>arr[j]){
                   Smallest=j;
               }
            }
            int temp=arr[Smallest];
            arr[Smallest]=arr[i];
            arr[i]=temp;
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,1,4};
        Selection(arr);
    }
}
