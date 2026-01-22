package BinarySearch;

public class KeyNdArray {

    public static boolean Search(int arr[],int target){
        int st=0,ed= arr.length-1;
        while(st<=ed){
            int mid=st+(ed-st)/2;
            if(arr[mid]==target){
                return true;
            }
            if(target<arr[mid]){
                ed=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,4,7,10,17},target=10;
        System.out.print(Search(arr,target));
    }
}
