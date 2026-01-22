package Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr={4,8,2,4,6,2,1}; int t=8;

        for(int i=0;i< arr.length;i=i+1){
            if(arr[i]==t){
                System.out.println("It is present");
            }
            else{
                System.out.println("it is not");
            }
        }

    }
}
