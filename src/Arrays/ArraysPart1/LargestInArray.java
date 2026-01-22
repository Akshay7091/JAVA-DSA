package Arrays.ArraysPart1;



public class LargestInArray {

    public static int Largest(int arr[]){
        int large=Integer.MIN_VALUE;  //Smallest Value Possible
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int arr[]={22,43,23,53,23};
        System.out.println(Largest(arr));
    }
}
