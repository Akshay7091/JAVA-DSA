package BInaryTrees.BinarySearchTree;

public class Search {

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
            if(val>root.data){
                root.right=buildTree(root.right,val);
            }
            else{
                root.left=buildTree(root.left,val);
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

        public Node Searchh(Node root,int key){
            if(root==null){
                return null;
            }
            if(root.data==key){
                return root;
            }
            if(root.data>key){
                return Searchh(root.left,key);
            }
            else{
               return Searchh(root.right,key);
            }
        }
    }
    public static void main(String[] args) {
        int nodes[]={5,1,3,2,6,4,7};
        binarySearchTree tree=new binarySearchTree();
        Node root=null;
        for (int node : nodes) {
            root = tree.buildTree(root, node);
        }
        int key=7;
        Node result = tree.Searchh(root, key);
        if(result!=null){
            System.out.print(result.data);
        }
        else{
            System.out.print("Not present in the tree");
        }
    }
}
