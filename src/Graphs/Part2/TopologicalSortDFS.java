package Graphs.Part2;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortDFS {

    public static void topSort(ArrayList<ArrayList<Integer>> adjList){
        boolean[] vis=new boolean[adjList.size()];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i< adjList.size();i++){
            if(!vis[i]){
                dfsUtil(adjList,vis,st,i);
            }
        }

        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }

    public static void dfsUtil(ArrayList<ArrayList<Integer>> adjList,boolean[] vis,Stack<Integer> st,int curr){
        vis[curr]=true;

        for(int i=0;i<adjList.get(curr).size();i++){
            if(!vis[adjList.get(curr).get(i)]){
                dfsUtil(adjList,vis,st,adjList.get(curr).get(i));
            }
        }
        st.push(curr);
    }
    public static void main(String[] args) {
        int[][] edges={{2,3},{3,1},{4,1},{5,2},{4,0},{5,0}};int v=6;

        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i< edges.length;i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
        }

        topSort(adjList);
    }
}
