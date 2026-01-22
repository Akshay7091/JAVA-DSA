package BinarySearch;

public class KeyNdRotatedArray {
    public static boolean Search(int arr[],int target){
        int st=0,ed= arr.length-1;
        while(st<=ed){
            int mid=st+(ed-st)/2;
            if(arr[mid]==target) return true;

            if(arr[st]<arr[mid]){
                if(target>=arr[st] && target<arr[mid]){
                    ed=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            else{
                if(target<=arr[ed] &&  target>arr[mid] ){
                  st=mid+1;
                }
                else{
                    ed=mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={6,7,0,1,2},target=6;
        System.out.print(Search(arr,target));
    }
}
