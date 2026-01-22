package Graphs.Part2.CycleDetection.DirectedGraph;

import java.util.ArrayList;

public class UsingDFS {

    public static boolean dfs(ArrayList<ArrayList<Integer>> adjList){
        boolean[] vis=new boolean[adjList.size()];
        boolean[] pathVis=new boolean[adjList.size()];

        for(int i=0;i< adjList.size();i++){
            if(!vis[i]){
                if(dfsUtil(adjList,vis,i,pathVis)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfsUtil(ArrayList<ArrayList<Integer>> adjList,boolean[] vis,int curr,boolean[] pathVis){
        vis[curr]=true;
        pathVis[curr]=true;
        for(int i=0;i<adjList.get(curr).size();i++){
            if(!vis[adjList.get(curr).get(i)]){
                if(dfsUtil(adjList,vis,adjList.get(curr).get(i),pathVis)){
                    return true;
                }
            }
            else if(pathVis[adjList.get(curr).get(i)]) return true;
        }
        pathVis[curr]=false;
        return false;
    }
    public static void main(String[] args) {
        int[][] edges={{1,0},{2,0},{3,0},{3,2}};int v=4;
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
        }

        System.out.print(dfs(adjList));
    }
}
