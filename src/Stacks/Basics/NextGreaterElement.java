package Stacks.Basics;

import java.util.*;

public class NextGreaterElement {
    protected static void NextGreater(int arr[],int res[]){
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.empty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.empty()){
                res[i]=-1;
            }
            else{
                res[i]=s.peek();
            }
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,8,2,1,3};
        
        int res[]=new int[arr.length];
        NextGreater(arr,res);
        for(int val:res){
            System.out.print(val+" ");
        }
    }
}
