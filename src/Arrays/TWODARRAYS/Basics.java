package Arrays.TWODARRAYS;

import java.util.Scanner;

public class Basics {

    public static void InputAndOutput(int arr[][],int n,int m){
        Scanner sc=new Scanner(System.in);
        // Input
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                int a= sc.nextInt();
                arr[i][j]=a;
            }
        }
        // Output
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean Search(int arr[][]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Target: ");
        int target= sc.nextInt();
        for(int i=0;i<= arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                if(arr[i][j]==target){
                    System.out.print("The Target is at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.print("Target is not in the Matrix");
        return false;
    }
    public static void LargestAndSmallest(int arr[][]){
        int Largest=Integer.MIN_VALUE,Smallest=Integer.MAX_VALUE;
        for(int i=0;i<= arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                Largest=Math.max(Largest,arr[i][j]);
                Smallest=Math.min(Smallest,arr[i][j]);
            }
        }
        System.out.println("The Largest and the Smallest Values in the Matrix are: "+Largest+","+Smallest);
    }
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int n= arr.length,m=arr[0].length;
        InputAndOutput(arr,n,m);
        Search(arr);
        LargestAndSmallest(arr);
    }
}
