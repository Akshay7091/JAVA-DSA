package BInaryTrees.BinarySearchTree;

public class PrintInRange {

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
            else if(val< root.data){
                root.left=buildTree(root.left,val);
            }
            else{
                root.right=buildTree(root.right,val);
            }
            return root;
        }

        public void Range(Node root,int k1,int k2){
            if(root==null){
                return;
            }
            if(root.data>=k1 && root.data<=k2){
                Range(root.left,k1,k2);
                System.out.print(root.data+" ");
                Range(root.right,k1,k2);
            }
            else if(root.data<k1){
                Range(root.right,k1,k2);
            }
            else{
                Range(root.left,k1,k2);
            }
        }
    }
    public static void main(String[] args) {
        int nodes[]={8,5,10,3,6,11,1,4,14};
        binarySearchTree tree=new binarySearchTree();
        Node root=null;
        for(int val:nodes){
            root=tree.buildTree(root,val);
        }

        tree.Range(root,5,12);
    }
}
