package Graphs.Part3;

import java.util.ArrayList;

public class AllPathsFrmSrcToTar {

    public static void dfs(ArrayList<ArrayList<Integer>> adjList,boolean[] vis,int src,int d,String temp){
        if(src==d){
            System.out.print(temp);
            System.out.println();
            return;
        }
        vis[src]=true;
        for(int i=0;i<adjList.get(src).size();i++){
            if(!vis[adjList.get(src).get(i)]){
                dfs(adjList,vis,adjList.get(src).get(i),d,temp+"->"+adjList.get(src).get(i));
            }
        }
        vis[src]=false;

    }
    public static void main(String[] args) {
        int v=6;int[][] edges={{5,0},{5,2},{4,0},{4,1},{0,3},{2,3},{3,1}};
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i< edges.length;i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
        }
        boolean[] vis=new boolean[adjList.size()];
        dfs(adjList,vis,5,1,""+5);
    }
}
