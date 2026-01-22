package Arrays.ArraysPart2;
import java.lang.reflect.Array;
import java.util.*;

public class LonelyNumbersInArray {
    public static ArrayList<Integer> Lonely(int arr[]){
        ArrayList<Integer> arr1=new ArrayList<>();
        Arrays.sort(arr);

       for(int i=0;i<= arr.length-1;i++){
           boolean IsLonely=true;
           if(i>0 && arr[i]-arr[i-1]==1){
               IsLonely=false;
           }
           if(i<arr.length-1 && arr[i+1]-arr[i]==1){
               IsLonely=false;
           }
           if(IsLonely){
               arr1.add(arr[i]);
           }
       }
        return arr1;
    }
    public static void main(String[] args) {
        int arr[]={10,11,6,5,8};
        System.out.println(Lonely(arr));
    }
}
