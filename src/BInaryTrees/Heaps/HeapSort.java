package BInaryTrees.Heaps;

public class HeapSort {

    public static void heapify(int[] arr, int idx, int n){
        int left=2*idx+1,right=2*idx+2,maxIdx=idx;

        if(left<n && arr[left]>arr[maxIdx] ){
            maxIdx=left;
        }

        if(right<n && arr[right]>arr[maxIdx]){
            maxIdx=right;
        }

        if(maxIdx!=idx){
            int temp=arr[idx];
            arr[idx]=arr[maxIdx];
            arr[maxIdx]=temp;

            heapify(arr,maxIdx,n);
        }
    }
    public static void heapSort(int[] arr){
        for(int i=(arr.length/2)-1;i>=0;i--){  //for ascending order convert the given array to maxheap;
            heapify(arr,i,arr.length);
        }

        for(int i=arr.length-1;i>0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;

            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,3};
        heapSort(arr);

        for(int val:arr) System.out.print(val+" ");
    }
}
