package Graphs.Part2.CycleDetection.UndirectedGraph;

import java.util.ArrayList;

public class UsingDFS {

    public static boolean dfs(ArrayList<ArrayList<Integer>> adjList){
        boolean[] vis=new boolean[adjList.size()];
        for(int i=0;i< adjList.size();i++){
           if(!vis[i] && dfsUtil(adjList,vis,i,-1)){
                return true;
            }
        }
        return false;
    }

    public static boolean dfsUtil(ArrayList<ArrayList<Integer>> adjList,boolean[] vis,int curr,int parent){
        vis[curr]=true;

        for(int i=0;i<adjList.get(curr).size();i++){
            if(!vis[adjList.get(curr).get(i)]){
                if(dfsUtil(adjList, vis, adjList.get(curr).get(i),curr)) return true;
            }

            else if(parent!=adjList.get(curr).get(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=5;int[][] edges={{0,1},{0,2},{0,3},{1,2},{2,4}};

        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i< edges.length;i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        System.out.print(dfs(adjList));
    }
}
