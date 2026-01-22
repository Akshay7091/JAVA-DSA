
package Recursion.Backtracking;
import java.util.*;
public class ReverseArrayList {
    public static ArrayList<Integer> Reverse(ArrayList<Integer> arr){
        for(int i=0,j=arr.size()-1;i<j;i++,j--){
            int temp= arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j,temp);
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        int i=1;
        while(i<=5){
            arr.add(i);
            i++;
        }
        System.out.println(arr);
        System.out.println(Reverse(arr));
        System.out.println(arr);
    }
}
