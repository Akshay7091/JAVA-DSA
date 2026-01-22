package Arrays.ArraysPart1;

public class SubArray {

    public static void Subarray(int arr[]){
        for(int i=0;i<= arr.length-1;i++){
            int st=i;
            for(int j=i;j<= arr.length-1;j++){
                int ed=j;
                for(int k=st;k<=ed;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Subarray(arr);
    }
}
