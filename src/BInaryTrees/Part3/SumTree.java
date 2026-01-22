package BInaryTrees.Part3;

public class SumTree {

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


        public int sumTree(Node root){
            if(root==null){
                return 0;
            }
            int l=sumTree(root.left);
            int r=sumTree(root.right);
            int oldVal=root.data;
            root.data=l+r;
            return root.data +oldVal ;
        }

        public void PrintPreorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            PrintPreorder(root.left);
            PrintPreorder(root.right);
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildTree(nodes);
        tree.sumTree(root);
        tree.PrintPreorder(root);
    }
}
