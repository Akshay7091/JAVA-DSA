package Arrays.ArraysPart1;

public class ReverseOfArrayReducedSpaceCom {

    public static void Reverse(int arr[]){
        int st=0,ed= arr.length-1;
        while (st<=ed){
            int temp =arr[st];
            arr[st]=arr[ed];
            arr[ed]=temp;
            st++;ed--;
        }
        for(int val:arr){
            System.out.print(val);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Reverse(arr);
    }
}
