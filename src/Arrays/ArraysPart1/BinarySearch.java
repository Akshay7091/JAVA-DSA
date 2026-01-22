package Arrays.ArraysPart1;

public class BinarySearch {

    public static int LinearSearch(int arr[],int a){
        int ed= arr.length-1;int st=0;
        while(st<=ed){
            int mid=(st+ed)/2;
            if(arr[mid]==a){
                return mid;
            }
            else if(arr[mid]>a){
                ed=mid-1;
            } else if (arr[mid]<a) {
                st=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};int target=10;
        System.out.print(LinearSearch(arr,target));
    }
}
