package Recursion.Backtracking;
import java.util.*;
public class MonotonicArrayList {
    public static boolean IsMonotonic(ArrayList<Integer> arr){
        boolean increasing=true,decreasing=true;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)< arr.get(i+1)) decreasing=false;
            if(arr.get(i)> arr.get(i+1)) increasing=false;
        }
        return increasing || decreasing;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        //arr.add(4);

        System.out.print(IsMonotonic(arr));
    }
}

