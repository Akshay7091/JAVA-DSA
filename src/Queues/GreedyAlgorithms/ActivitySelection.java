package Queues.GreedyAlgorithms;

import java.util.Deque;
import java.util.LinkedList;

public class ActivitySelection {
    public static int Output(int st[],int ed[]){
        Deque<Integer> q=new LinkedList<>();
        int count=1;
        q.offer(0);
        for(int i=1;i<st.length;i++){
            if(!q.isEmpty() && st[i]>=ed[q.getLast()]){
                count++;
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            System.out.print("A"+q.poll()+" ");
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
        int st[]={1,3,0,5,8,5},ed[]={2,4,6,7,9,9};
        System.out.print(Output(st,ed));
    }
}
