package Arrays.ArraysPart1;

public class ReverseOfArray {

    public static void Reverse(int arr[]){
        int arr2[]=new int[arr.length];
        for(int i= arr.length-1;i>=0;i--){
            arr2[(arr.length-1)-i]=arr[i];
        }
        for(int val:arr2){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Reverse(arr);
    }
}
