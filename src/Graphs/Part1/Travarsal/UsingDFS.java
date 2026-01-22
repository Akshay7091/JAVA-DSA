package Graphs.Part1.Travarsal;

import java.util.ArrayList;

public class UsingDFS {

    public static void dfs(ArrayList<ArrayList<Integer>> adjList){
        boolean[] vis=new boolean[adjList.size()];

        for(int i=0;i< adjList.size();i++){
            if(!vis[i]){
                dfsUtil(adjList,vis,i);
            }
        }
    }
    public static void dfsUtil(ArrayList<ArrayList<Integer>> adjList,boolean[] vis,int curr){
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<adjList.get(curr).size();i++){
            if(!vis[adjList.get(curr).get(i)]){
                dfsUtil(adjList,vis,adjList.get(curr).get(i));
            }
        }
    }
    public static void main(String[] args) {
        int v=7;int[][] edges={{0,1},{0,2},{1,3},{2,4},{3,4},{3,5},{4,5},{5,6}};
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }
        dfs(adjList);
    }
}
