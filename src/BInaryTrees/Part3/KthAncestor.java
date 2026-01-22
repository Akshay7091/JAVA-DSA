package BInaryTrees.Part3;

public class KthAncestor {

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

        public int Kth(Node root,int n,int k){
            if(root==null){
                return -1;
            }

            if(root.data==n){
                return 0;
            }
            int left=Kth(root.left,n,k),right=Kth(root.right,n,k);
            if(left==-1 && right==-1){
                return -1;
            }
            int max=Math.max(left,right);
            if(max+1==k){
                System.out.print(root.data);
            }
            return max+1;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildTree(nodes);

        tree.Kth(root,5,1);
    }
}
