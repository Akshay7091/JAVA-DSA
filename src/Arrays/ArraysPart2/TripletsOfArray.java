package Arrays.ArraysPart2;

public class TripletsOfArray {

    public static void Triplet(int arr[]){
        for(int i=0;i<= arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                for(int k=j+1;k<= arr.length-1;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
                        System.out.println();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={-1, 0, 1, 2, -1, -4};
        Triplet(arr);
    }
}
