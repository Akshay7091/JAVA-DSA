package Recursion.DivideNdConquer;

public class KeyNdRotatedArray {

    public static int Search(int arr[],int st,int ed,int target){
        if(st>ed){
            return -1;
        }

        int mid=st+(ed-st)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(arr[st]<arr[mid]){
            if(target>=arr[st] && target<arr[mid]){
                return Search(arr,st,mid-1,target);
            }
            else{
                return Search(arr,mid+1,ed,target);
            }
        }
        else{
            if(target<=arr[ed] && target>arr[mid]){
                return Search(arr,mid+1,ed,target);
            }
            else{
                return Search(arr, st, mid-1, target);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2},target=0;
        if(Search(arr,0, arr.length-1 ,target)==-1){
            System.out.print("Target is not found");
        }
        else{
            System.out.print("The target is at the index at: "+Search(arr,0,arr.length-1,target));
        }
    }
}
