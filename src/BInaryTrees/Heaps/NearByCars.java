package BInaryTrees.Heaps;

import java.util.PriorityQueue;

public class NearByCars {
    static class Info implements Comparable<Info>{
        int idx,dist;
        Info(int idx,int dist){
            this.idx=idx;
            this.dist=dist;
        }
        public int compareTo(Info i2){
            return this.dist-i2.dist;
        }
    }
    public static void main(String[] args) {
        int[][] arr={{3,3},{5,-1},{-2,4}};int k=2;
        PriorityQueue<Info> pq=new PriorityQueue<>();
        for(int i=0;i< arr.length;i++){
            int dist=arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1];
            pq.add(new Info(i,dist));
        }
        for(int i=0;i<k;i++){
            System.out.println("Car"+pq.remove().idx);
        }
    }
}
