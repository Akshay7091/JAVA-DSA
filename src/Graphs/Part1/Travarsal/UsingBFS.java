package Graphs.Part1.Travarsal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UsingBFS {

    public static void bfs(ArrayList<ArrayList<Integer>> adjList){
        boolean[] vis=new boolean[adjList.size()];
        for(int i=0;i< adjList.size();i++){
            if(!vis[i]){
                bfsUtil(adjList,vis,i);
            }
        }
    }
    public static void bfsUtil(ArrayList<ArrayList<Integer>> adjList,boolean[] vis,int ver){
        Queue<Integer> q=new LinkedList<>();
        q.offer(ver);
        vis[ver]=true;

        while(!q.isEmpty()){
            int curr=q.poll();
            for(int i=0;i<adjList.get(curr).size();i++){
                if(!vis[adjList.get(curr).get(i)]){
                    q.offer(adjList.get(curr).get(i));
                    vis[adjList.get(curr).get(i)]=true;
                }
            }
            System.out.print(curr+" ");
        }
    }
    public static void main(String[] args) {
        int v=7;int[][] edges={{0,1},{0,2},{1,3},{2,4},{3,4},{3,5},{4,5},{5,6}};

        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

        for(int i=0;i<7;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i< edges.length;i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }
        bfs(adjList);
    }
}
