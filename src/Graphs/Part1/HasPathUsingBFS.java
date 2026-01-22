package Graphs.Part1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class HasPathUsingBFS {

    public static boolean bfs(ArrayList<ArrayList<Integer>> adjList,boolean[] vis,int src,int des){
        Queue<Integer> q=new LinkedList<>();
        q.offer(src);
        vis[src]=true;

        while(!q.isEmpty()){
            src=q.poll();
            if(src==des) return true;

            for(int i=0;i<adjList.get(src).size();i++){
                if(!vis[adjList.get(src).get(i)]){
                    q.offer(adjList.get(src).get(i));
                    vis[adjList.get(src).get(i)]=true;
                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=3;int[][] edges={{0,1},{1,2},{2,0}};

        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

        boolean[] vis=new boolean[v];
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        System.out.print(bfs(adjList,vis,0,2));
    }
}
