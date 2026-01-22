package BInaryTrees.Heaps;

import java.util.PriorityQueue;

public class ConnectNRopestoGetMinumumCost {
    public static void main(String[] args) {
        int[] ropes={2,3,3,4,6};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int rope : ropes) {
            pq.add(rope);
        }
        int cost=0;
        while(pq.size()>1){
            int num1=pq.remove(),num2=pq.remove();
            cost+=num1+num2;
            pq.add(num1+num2);
        }
        System.out.print(cost);
    }
}
