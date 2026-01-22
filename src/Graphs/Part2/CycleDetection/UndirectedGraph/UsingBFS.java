package Graphs.Part2.CycleDetection.UndirectedGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UsingBFS {

    public static boolean bfs(ArrayList<ArrayList<Integer>> adjList){
        boolean[] vis=new boolean[adjList.size()];
        for(int i=0;i<adjList.size();i++){
            if(!vis[i]){
                if(bfsUtil(adjList,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean bfsUtil(ArrayList<ArrayList<Integer>> adjList,boolean[] vis,int curr,int parent){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{curr,parent});
        vis[curr]=true;
        while(!q.isEmpty()){
            int[] arr=q.poll();
            curr=arr[0];
            parent=arr[1];

            for(int i=0;i<adjList.get(curr).size();i++){
                if(!vis[adjList.get(curr).get(i)]){
                    q.offer(new int[]{adjList.get(curr).get(i),curr});
                    vis[adjList.get(curr).get(i)]=true;
                }
                else if(adjList.get(curr).get(i)!=parent){
                    return true;
                }
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

        for(int i=0;i<edges.length;i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        System.out.print(bfs(adjList));
    }
}
