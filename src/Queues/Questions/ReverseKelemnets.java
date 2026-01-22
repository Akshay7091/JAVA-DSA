package Queues.Questions;
import java.util.*;

public class ReverseKelemnets {

    public static Queue<Integer> Output(Queue<Integer> q,int k){
        Stack<Integer>h=new Stack<>();
        for(int i=0;i<k;i++){
            h.push(q.poll());
        }
        int rsize=q.size();
        while(!h.isEmpty()){
            q.offer(h.pop());
        }
        for(int i=0;i<rsize;i++){
            q.offer(q.poll());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue <Integer> q=new LinkedList<>();int k=5;
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
        Queue<Integer> res=Output(q,k);
        while(!res.isEmpty()){
            System.out.print(res.poll() +" ");
        }
    }
}
