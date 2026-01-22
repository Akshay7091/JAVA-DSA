package BInaryTrees.BinarySearchTree;

public class DeleteANode {

    static class Node{
        int data;Node left,right;
        Node(int data){
            this.data=data;
        }
    }

    static class binarySearchTee{
        public Node buildTree(Node root,int val){
            if(root==null){
                return new Node(val);
            }
            if(val>root.data){
                root.right=buildTree(root.right,val);
            }
            else{
                root.left=buildTree(root.left,val);
            }
            return root;
        }
        public Node leftMostNode(Node root){
            while(root.left!=null) root=root.left;
            return root;
        }
        public Node Delete(Node root,int key){
            if(root==null){
                return null;
            }
            if(root.data>key){
                root.left= Delete(root.left,key);
            }
            else if(root.data<key){
                root.right= Delete(root.right,key);
            }
            else{
                if(root.left==null && root.right==null){
                    return null;
                }
                else if(root.right==null){
                    return root.left;
                }
                else if(root.left==null){
                    return root.right;
                }
                else{
                    Node IS =leftMostNode(root.right); // IS means InOrder Successor.....
                    // InOrder Successor Means the leftmost node of right subtree of a root node
                    root.data= IS.data;
                    root.right= Delete(root.right, IS.data);
                }
            }
            return root;
        }

        public void inOrder(Node root){
            if(root==null) return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        int[] nodes={8,5,10,3,6,11,1,4,14};
        binarySearchTee tree=new binarySearchTee();
        Node root=null;
        for(int val:nodes){
            root=tree.buildTree(root,val);
        }
        tree.inOrder(root);
        System.out.println();
        root=tree.Delete(root,14);
        tree.inOrder(root);
    }
}
