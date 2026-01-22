package Queues.Questions;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    public static int[] SlidingWindow(int[] input,int k){
        int[] arr=new int[input.length-k+1];int i=0;
        Deque<Integer> dq=new LinkedList<>();

        for(int s=0;s<k;s++){
            while(!dq.isEmpty() && input[s]>input[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offer(s);
        }

        if(!dq.isEmpty()) arr[i++]=input[dq.peek()];

        for(int j=k;j< input.length;j++){
            while(!dq.isEmpty() && dq.peek()<=j-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && input[j]>input[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(j);
            if(!dq.isEmpty()) arr[i++]=input[dq.peek()];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] res=SlidingWindow(arr,3);

        for(int val:res){
            System.out.print(val+" ");
        }
    }
}
