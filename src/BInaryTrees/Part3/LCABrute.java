package BInaryTrees.Part3;

import java.util.ArrayList;

public class LCABrute {

    static class Node{
        int data;Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class binaryTree{
        int idx=-1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node NewNode=new Node(nodes[idx]);
            NewNode.left=buildTree(nodes);
            NewNode.right=buildTree(nodes);

            return NewNode;
        }

        public boolean getPath(Node root,int n,ArrayList<Node> path){
            if(root==null){
                return false;
            }
            path.add(root);
            if(root.data==n){
                return true;
            }
            if(getPath(root.left,n,path) || getPath(root.right,n,path)){
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }
        public Node LCA(Node root,int n1,int n2){
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();


            if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
                return null;
            }
            int i=0;
            for(;i<path1.size()&&i< path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }

            return path1.get(i-1);
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildTree(nodes);

        System.out.print(tree.LCA(root,4,5).data);
    }
}
