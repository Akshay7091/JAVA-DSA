package Recursion.DivideNdConquer;

public class QuickSort {

    public static void Quick(int arr[],int st,int ed){
        if(st>=ed){
            return;
        }
        int i=st-1;
        int pivot=arr[ed];
        for(int j=st;j<ed;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[ed];
        arr[ed]=arr[i];
        arr[i]=temp;

        Quick(arr,st,i-1);
        Quick(arr,i+1,ed);
    }
    public static void main(String[] args) {
        int arr[]={3,4,9,1,7,0,5,2,6,8};
        Quick(arr,0, arr.length-1);
        for(int val:arr){
            System.out.print(val + " ");
        }
    }
}
