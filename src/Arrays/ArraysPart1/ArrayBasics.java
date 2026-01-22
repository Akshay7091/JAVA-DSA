package Arrays.ArraysPart1;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];int a;int count=0;
        for(int i=1;i<=4;i++){
            a= sc.nextInt();
            arr[i]=a;
            count++;
        }
        arr[2]=69;
        for(int i=1;i<=count;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(arr.length);
    }
}
