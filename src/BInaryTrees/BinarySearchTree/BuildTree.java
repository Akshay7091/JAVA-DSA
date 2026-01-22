package BInaryTrees.BinarySearchTree;

public class BuildTree {

    static class Node{
        int data;Node left,right;
        Node(int data){
            this.data=data;
        }
    }

    static class binarySearchTree{
        public Node buildTree(Node root,int val){
            if(root==null){
                return new Node(val);
            }
            if(val> root.data){
                root.right=buildTree(root.right, val);
            }
            else{
                root.left=buildTree(root.left, val);
            }
            return root;
        }

        public void Inorder(Node root){
            if(root==null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
    public static void main(String[] args) {
        int nodes[]={5,1,3,4,2,6,7};
        binarySearchTree tree=new binarySearchTree();
        Node root=null;
        for (int node : nodes) {
            root = tree.buildTree(root, node);
        }
        tree.Inorder(root);
    }
}
