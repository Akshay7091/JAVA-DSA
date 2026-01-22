package Recursion.DivideNdConquer;

public class SortArrayOfStrings {

    public static void Sort(String arr[],int st,int ed){
        if(st>=ed){
            return;
        }
        int mid=st+(ed-st)/2;
        Sort(arr,st,mid);
        Sort(arr,mid+1,ed);

        Merge(arr,st,mid,ed);
    }

    public static void Merge(String arr[],int st,int mid,int ed){
        String temp[]=new String[ed-st+1];
        int i=st,j=mid+1,k=0;

        while(i<=mid && j<=ed){
            if(IsSmaller(arr[i],arr[j])){
               temp[k]=arr[i++];
            }
            else{
                temp[k]=arr[j++];
            }
            k++;
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ed){
            temp[k++]=arr[j++];
        }

        for(int o=st,f=0;f< temp.length;o++,f++){
            arr[o]=temp[f];
        }
    }

    public static boolean IsSmaller(String str1, String str2){
        return str1.compareTo(str2) < 0;
    }
    public static void main(String[] args) {
        String arr[] = { "uranus","sun", "earth", "mars", "mercury" ,"akshay"};
        Sort(arr,0,arr.length-1);
        for(String val:arr){
            System.out.print(val+" ");
        }
    }
}
