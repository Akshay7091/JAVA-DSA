package Recursion.BasicsPart1;

public class LastOccurance {
    public static int Last(int arr[],int k,int i,int count){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==k){
            count++;
            if(count>1){
                return i;
            }
        }
        return Last(arr,k,i+1,count);
    }
    public static void main(String[] args) {
        int arr[]={8,6,9,3,2,3,5,6,5,5};
        int k=3,i=0,count=0;
        System.out.print(Last(arr,k,i,count));
    }
}
