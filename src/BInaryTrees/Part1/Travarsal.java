package BInaryTrees.Part1;

import java.util.LinkedList;
import java.util.Queue;

public class Travarsal {

    static class Node{
       Node left;Node right;int data;

       Node(int data){
           this.data=data;
           this.left=null;
           this.right=null;
       }

    }

    static class BinaryTree{
       int idx=-1;
        public  Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
        }

        public void PrintPreorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            PrintPreorder(root.left);
            PrintPreorder(root.right);
        }

        public int PrintLevelOrder(Node root){
            if(root==null) return 0;int ht=1;
            Queue<Node> q=new LinkedList<>();
            q.offer(root);

            while(!q.isEmpty()){
               int size=q.size();
               for(int i=0;i<size;i++){
                   Node curr=q.poll();
                   System.out.println(curr.data);
                   if(curr.left!=null) q.offer(curr.left);
                   if(curr.right!=null) q.offer(curr.right);
               }
            }
            return ht;
        }
        public int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree1=new BinaryTree();
        Node root=tree1.BuildTree(nodes);
        System.out.println(tree1.PrintLevelOrder(root));
    }
}
