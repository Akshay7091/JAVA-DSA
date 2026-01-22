package Arrays.TWODARRAYS;

import java.util.Scanner;

public class StaircaseSearch {
    public static boolean StairCaseSearch(int arr[][], int target){ //WORKS ONLY FOR SORTED 2D ARRAYS
        int row=arr.length-1;int col= 0; //we start from the bottommost left diagonal element
        while(row>=0 && col<= arr[0].length-1){
            if(target==arr[row][col]){
                System.out.print("Found at: "+row+","+col);
                return true;
            }
            else if(target>arr[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        System.out.println("NOt Found!");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
     int target= sc.nextInt();
     StairCaseSearch(arr,target);
    }
}
