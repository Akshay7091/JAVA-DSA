package Graphs.Part3;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkastrasAlgorithmShortestPathBFS {

    public static class Edge{
        int src,des,wt;
        Edge(int src,int des,int wt){
            this.src=src;
            this.des=des;
            this.wt=wt;
        }
    }

    public static class Pair implements Comparable<Pair>{
        int node,path;
        Pair(int node,int path){
            this.node=node;
            this.path=path;
        }
        public int compareTo(Pair p2){
            return this.path-p2.path;
        }
    }
    public static void dijkastraAlgo(ArrayList<ArrayList<Edge>> adjList,int source){
        boolean[] vis=new boolean[adjList.size()];
        int[] distFrmSrc=new int[adjList.size()];
        for(int i=0;i<distFrmSrc.length;i++){
            if(i==source) distFrmSrc[i]=0;
            else{
                distFrmSrc[i]=Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.offer(new Pair(source,distFrmSrc[source]));

        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            if(!vis[curr.node]){
                vis[curr.node]=true;
                for(int i=0;i<adjList.get(curr.node).size();i++){
                    int u= curr.node;
                    int v=adjList.get(curr.node).get(i).des;
                    int wt=adjList.get(curr.node).get(i).wt;

                    if(distFrmSrc[u] != Integer.MAX_VALUE && distFrmSrc[u]+wt<distFrmSrc[v]){
                        distFrmSrc[v]=distFrmSrc[u]+wt;
                        pq.offer(new Pair(v,distFrmSrc[v]));
                    }
                }
            }
        }

        for (int j : distFrmSrc) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int v=6;int[][] edges={{0,1,2},{0,2,4},{1,2,2},{1,3,7},{2,4,3},{3,5,1},{4,3,2},{4,5,5}};

        ArrayList<ArrayList<Edge>> adjList=new ArrayList<>();
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adjList.get(edge[0]).add(new Edge(edge[0], edge[1], edge[2]));
        }
        int source=0;
        dijkastraAlgo(adjList,source);
    }
}
