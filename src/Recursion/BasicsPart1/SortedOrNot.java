package Recursion.BasicsPart1;

public class SortedOrNot {

    public static Boolean Sorted(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
       return Sorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int i=0;
        System.out.print(Sorted(arr,i));
    }
}
