package Graphs.Part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Kahn's algorithm
public class TopologicalSortBFS {

    public static void topSort(ArrayList<ArrayList<Integer>> adjList, int[] inDegree){
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i< adjList.size();i++){
            if(inDegree[i]==0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int curr=q.poll();
            System.out.print(curr+" ");
            for(int i=0;i<adjList.get(curr).size();i++){
                inDegree[adjList.get(curr).get(i)]--;
            }
            for(int i=0;i<adjList.get(curr).size();i++){
                if(inDegree[adjList.get(curr).get(i)]==0){
                    q.offer(adjList.get(curr).get(i));
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] edges={{0,2},{1,2}};int v=3;

        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
        int[] inDegree=new int[adjList.size()];
        for(int i=0;i<edges.length;i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            inDegree[edges[i][1]]++;
        }
        topSort(adjList,inDegree);
    }
}
