package BInaryTrees.Part3;

public class KthLevel {

    static class Node{
        int data;Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class binaryTree {
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

        public void KthLevel(Node root,int level,int targetLevel){
            if(root==null){
                return;
            }
            if(level==targetLevel){
                System.out.print(root.data+" ");
            }
            KthLevel(root.left,level+1,targetLevel);
            KthLevel(root.right,level+1,targetLevel);
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.BuildTree(nodes);

        tree.KthLevel(root,1,3);
    }
}
