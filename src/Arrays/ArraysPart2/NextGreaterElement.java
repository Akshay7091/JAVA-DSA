package Arrays.ArraysPart2;

import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int res[]=new int[arr.length];
        Arrays.fill(res,-1);

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    res[i]=arr[j];
                    break;
                }
            }
        }
        for(int val:res){
            System.out.print(val+" ");
        }
    }
}
