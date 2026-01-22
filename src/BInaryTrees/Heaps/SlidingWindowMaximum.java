package BInaryTrees.Heaps;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {

    static class Info implements Comparable<Info>{
        int val,idx;
        Info(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        public int compareTo(Info i2){
            return i2.val-this.val;
        }
    }
    public static int[] SlidingWindow(int[] input,int k){
        int[] arr=new int[input.length-k+1];int i=0;
        PriorityQueue<Info> pq=new PriorityQueue<>();
        for(int s=0;s<k;s++){
            pq.add(new Info(input[s],s ));
        }
        arr[i++]=pq.peek().val;

        for(int j=k;j< input.length;j++){
            while(!pq.isEmpty() && pq.peek().idx<=j-k){
                pq.poll();
            }
            pq.add(new Info(input[j],j ));
            arr[i++]=pq.peek().val;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        int[] res=SlidingWindow(arr,3);

        for(int val:res){
            System.out.print(val +" ");
        }
    }
}
