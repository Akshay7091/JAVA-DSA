package BInaryTrees.Part2;
import java.util.*;

public class TopViewOfTree {
    static class Node{
        int data;Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Info{
        Node node;int hd;
        Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    static class BinaryTree{
        int idx=-1;
        public Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node NewNode=new Node(nodes[idx]);
            NewNode.left=BuildTree(nodes);
            NewNode.right=BuildTree(nodes);

            return NewNode;
        }

        public void TopView(Node root){

            if(root==null) return;
            HashMap<Integer,Node> h=new HashMap<>();
            Queue<Info> q=new LinkedList<>();
            int min=0,max=0;
            q.offer(new Info(root,0));

            while(!q.isEmpty()){
                Info curr=q.poll();
                if(!h.containsKey(curr.hd)){
                    h.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.offer(new Info(curr.node.left,curr.hd-1));
                    min=Math.min(curr.hd-1, min);
                }

                if(curr.node.right!=null){
                    q.offer(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
            }

            for(int i=min;i<=max;i++){
                System.out.print(h.get(i).data+" ");
            }
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);

        tree.TopView(root);
    }
}
