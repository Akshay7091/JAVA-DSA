package Recursion.BasicsPart1;

public class FirstOccurance {

    public static int First(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
       return First(arr,key,i+1);

    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,10,2,5,3};
        int key=5,i=0;
        System.out.print(First(arr,key,i));
    }
}
