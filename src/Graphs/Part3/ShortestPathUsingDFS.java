package Graphs.Part3;

import java.util.ArrayList;

public class ShortestPathUsingDFS {

    public static class edge{
        int src, des,wt;
        edge(int src,int des,int wt){
            this.src=src;
            this.des =des;
            this.wt=wt;
        }
    }


    public static void dfs(ArrayList<ArrayList<edge>> adjList,int s,int d){

        boolean[] vis=new boolean[adjList.size()];
        int dist = dfsUtil(adjList,vis,d,s);
        if(dist!=Integer.MAX_VALUE){
            System.out.print(dist);
        }

    }

    public static int dfsUtil(ArrayList<ArrayList<edge>> adjList,boolean[] vis,int d,int curr){
        vis[curr]=true;
        if(curr==d){
            return 0;
        }
        int dis=Integer.MAX_VALUE;
        for(int i=0;i<adjList.get(curr).size();i++){
            if(!vis[adjList.get(curr).get(i).des]){
                int diss=dfsUtil(adjList,vis,d,adjList.get(curr).get(i).des);

                if(diss!=Integer.MAX_VALUE){
                    dis=Math.min(dis,diss+adjList.get(curr).get(i).wt);
                }
            }
        }
        vis[curr]=false;
        return dis;

    }
    public static void main(String[] args) {
        int v=6;int[][] edges={{0,1,1},{0,2,4},{1,2,2},{1,3,7},{2,4,3},{3,5,1},{4,3,2},{4,5,5}};
        ArrayList<ArrayList<edge>> adjList=new ArrayList<>();

        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i< edges.length;i++){
            adjList.get(edges[i][0]).add(new edge(edges[i][0],edges[i][1],edges[i][2]));
        }
        dfs(adjList,0,5);
    }
}
