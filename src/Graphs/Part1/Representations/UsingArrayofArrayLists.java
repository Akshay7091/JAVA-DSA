package Graphs.Part1.Representations;

import java.util.ArrayList;

public class UsingArrayofArrayLists {

    public static class edge{
        int s,d,w;
        edge(int s,int d,int w){
            this.s=s;
            this.d=d;
            this.w=w;
        }
    }

    /*      (5)
         0-----1
              / \
          (1)/   \ (3)
            /     \
           2 ----- 3
           |    (1)
           |
       (2) |
           |
           4
 */
    public static void main(String[] args) {
        int V=5; int[][] edgeList ={{0,1,5},{1,2,1},{1,3,3},{2,3,1},{2,4,2}};
        ArrayList<edge>[] adjList =new ArrayList[V];

        for(int i=0;i<V;i++){
            adjList[i]=new ArrayList<>();
        }

        for(int i = 0; i< edgeList.length; i++){
            adjList[edgeList[i][0]].add(new edge(edgeList[i][0], edgeList[i][1], edgeList[i][2]));
            adjList[edgeList[i][1]].add(new edge(edgeList[i][1], edgeList[i][0], edgeList[i][2]));
        }

        for(int i=0;i< adjList.length;i++){
            edge es=adjList[i].get(0);
            System.out.print(es.s+"--->");
            for(edge e:adjList[i]){
                System.out.print(e.d +" ");
            }
            System.out.println();
        }
    }
}
