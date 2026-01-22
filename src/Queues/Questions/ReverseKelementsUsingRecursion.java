package Queues.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseKelementsUsingRecursion {

    public static void Output (Queue<Integer> q,int k,int i){
        if(i==k){
            return;
        }
        int ele=q.poll();
        Output(q,k,i+1);
        q.offer(ele);
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();int k=5;
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer( 40);
        q.offer( 50);
        q.offer( 60);
        q.offer( 70);
        q.offer(80);
        q.offer(90);
        q.offer(100);
        Output(q,k,0);
        int size=q.size();
        for(int i=0;i<size-k;i++){
            q.offer(q.poll());
        }
        while(!q.isEmpty()){
            System.out.print(q.poll() +" ");
        }
    }
}
