package Recursion.DivideNdConquer;
public class MergeSort {

    public static void Sort(int arr[], int st, int ed){
        if(st>=ed){
            return;
        }

        int mid=st+(ed-st)/2;
        Sort(arr,st,mid);
        Sort(arr,mid+1,ed);
        Merge(arr,st,mid,ed);
    }

    public static void Merge(int arr[],int st,int mid,int ed){
        int temp[]=new int[ed-st+1];
        int i=st,j=mid+1,k=0;

        while(i<=mid && j<=ed){
            if(arr[i]<arr[j]){
                temp[k]=arr[i++];
            }
            else{
                temp[k]=arr[j++];
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ed){
            temp[k++]=arr[j++];
        }

        for(int o=st,f=0;f<temp.length;o++,f++){
            arr[o]=temp[f];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        Sort(arr,0,arr.length-1);

        for(int val:arr){
            System.out.print(val + " ");
        }
    }
}
