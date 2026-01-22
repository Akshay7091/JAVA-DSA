package Graphs.Part1;

import java.util.ArrayList;

public class HasPathUsingDFS {

    public static boolean dfs(ArrayList<ArrayList<Integer>> adjList,boolean[] vis,int src,int des){
        if(src==des) return true;

        vis[src]=true;
        for(int i=0;i<adjList.get(src).size();i++){
            if(!vis[adjList.get(src).get(i)] && dfs(adjList,vis, adjList.get(src).get(i),des)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=3;int[][] edges={{0,1},{1,2},{2,0}};
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

        boolean[] vis=new boolean[v];
        for(int i=0;i<v;i++) adjList.add(new ArrayList<>());

        for(int i=0;i< edges.length;i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        System.out.print(dfs(adjList,vis,0,2));
    }
}
