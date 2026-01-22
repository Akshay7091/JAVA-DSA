package BInaryTrees.Heaps;

import java.util.PriorityQueue;

public class WeakestSoldier {

    static class Info implements Comparable<Info>{
        int solider,idx;
        Info(int solider,int idx){
            this.solider=solider;
            this.idx=idx;
        }

        public int compareTo(Info i2){
            if(this.solider!= i2.solider){
                return this.solider-i2.solider;
            }
            return this.idx-i2.idx;
        }
    }
    public static void main(String[] args) {
        int[][] army={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;
        PriorityQueue<Info> pq=new PriorityQueue<>();
        for(int i=0;i< army.length;i++){
            int count=0;
            for(int j=0;j< army[0].length;j++){
                count+=army[i][j]==1? 1:0;
            }
            pq.add(new Info(count,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("idx "+pq.remove().idx);
        }
    }
}
