package Arrays.Sorting;

public class InsertionSort {
    public static void Insertion(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            int curr=arr[i];
            for(int j=i+1;j<= arr.length-1;j++){
                if(arr[j]<curr){
                    int temp=arr[j];
                    arr[i]=temp;
                }
                curr++;
            }
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Insertion(arr);
    }
}
