package BInaryTrees.Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Implementation
{
    static class Heaps{
        private static ArrayList<Integer> arr=new ArrayList<>();

        //MinHeap
        public void add(int val){
            arr.add(val);
            int child=arr.size()-1;
            int par=(child-1)/2;
            while(child>0 && arr.get(child)<arr.get(par)){
                int temp=arr.get(child);
                arr.set(child,arr.get(par));
                arr.set(par,temp);

                child=par;
                par=(child-1)/2;
            }
        }

        public int peek(){
            return arr.getFirst();
        }

        private void Heapify(int idx){
            int Minidx=idx;
            int left=2*idx+1,right=2*idx+2;
            if(left<arr.size() && arr.get(left)<arr.get(Minidx)){
                Minidx=left;
            }

            if(right<arr.size() && arr.get(right)<arr.get(Minidx)){
                Minidx=right;
            }

            if(Minidx!=idx){
                int temp=arr.get(idx);
                arr.set(idx, arr.get(Minidx));
                arr.set(Minidx,temp);

                Heapify(Minidx);
            }
        }

        // to remove the minimum value in min Heap or Max value in Max Heap(for max value remove few changes are req in the logic)
        public void remove(){
            int temp= arr.getLast();
            arr.set(arr.size()-1,arr.getFirst());
            arr.set(0,temp);

            arr.removeLast();

            if(!arr.isEmpty()){
                Heapify(0);
            }
        }

        public boolean isEmpty(){
            return arr.isEmpty();
        }
    }
    public static void main(String[] args) {
        Heaps pq=new Heaps();
        pq.add(4);
        pq.add(2);
        pq.add(6);
        pq.add(3);
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}
