package Arrays.ArraysPart1;

public class PREFIXSUM {

    public static void prefix(int arr[]){
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<= arr.length-1;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int val:prefix){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,7,3,8};
        prefix(arr);
    }
}
