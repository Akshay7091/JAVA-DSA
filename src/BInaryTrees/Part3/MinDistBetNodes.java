package BInaryTrees.Part3;

public class MinDistBetNodes {

    static class Node{
        int data;Node left,right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
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
        public Node LCA(Node root, int n1, int n2){
            if(root==null || root.data==n1 || root.data==n2){
                return root;
            }
            Node left=LCA(root.left,n1,n2);
            Node right=LCA(root.right,n1,n2);

            if(left==null){
                return right;
            }
            if(right==null){
                return left;
            }
            return root;
        }
        public int lcaDist(Node root, int n){
            if(root==null){
                return -1;
            }

            if(root.data==n){
                return 0;
            }
            int left= lcaDist(root.left,n);
            int right= lcaDist(root.right,n);

            if(left==-1 && right==-1){
                return -1;
            }
            else if(left==-1){
                return right+1;
            }
            else{
                return left+1;
            }
        }

        public int minDist(Node root,int p,int q){
            Node lca=LCA(root,p,q);
            int lcaDist1=lcaDist(lca,p);
            int lcaDist2=lcaDist(lca,q);

            return lcaDist1+lcaDist2;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildTree(nodes);

        System.out.print(tree.minDist(root,4,6));
    }
}
