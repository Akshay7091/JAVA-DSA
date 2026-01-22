package Arrays.Sorting;
import java.util.ArrayList;

public class BubbleSort {
    public static ArrayList<Integer> Bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<= arr.length-2-i;j++){  // you may ask why j<=arr.length-2 minus with i
                                                 // because it prevents the compiler to stop
                                                //checking already sorted numbers in the array
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        System.out.println(Bubble(arr));
    }
}
