package Recursion.DivideNdConquer;

public class MergeSortCleaned {

    public static int[] Sort(int arr[],int st,int ed){
        if(st==ed){
            int s[]=new int[1];
            s[0]=arr[st];
            return s;
        }

        int  mid=st+(ed-st)/2;
        int left[]=Sort(arr,st,mid);
        int right[]=Sort(arr,mid+1,ed);


        return Merge(left,right);
    }

    public static int[] Merge(int arr1[],int arr2[]){
        int m= arr1.length,n=arr2.length;
        int temp[]=new int[m+n];
        int i=0;int j=0;int k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                temp[k]=arr1[i++];
            }
            else{
                temp[k]=arr2[j++];
            }
            k++;
        }
        while(i<m){
            temp[k++]=arr1[i++];
        }
        while(j<n){
            temp[k++]=arr2[j++];
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int sorted[]=Sort(arr,0,arr.length-1);
        for(int val:sorted){
            System.out.print(val +" ");
        }
    }
}
