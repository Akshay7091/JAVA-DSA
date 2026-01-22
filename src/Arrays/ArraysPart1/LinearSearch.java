package Arrays.ArraysPart1;

public class LinearSearch {
    public static int LinearrSearch(String arr[],String a){
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==a){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String arr[]={"ab","cd","ef","gh"};String target="gh";
        System.out.print(LinearrSearch(arr,target));
    }
}
