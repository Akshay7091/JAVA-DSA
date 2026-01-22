package Recursion.Backtracking;

public class ArrayExample {
    public static void Example(int arr[],int i,int v){
        if(i==arr.length){
            return;
        }
        arr[i]=v;

        Example(arr,i+1,v+1); //Recursion step
        arr[i]=arr[i]-2; // Backtracking step
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        Example(arr,0,1);
        for(int val:arr){
            System.out.print(val +" ");
        }
    }
}
