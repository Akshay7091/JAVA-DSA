package BInaryTrees.Part3;

public class LCAOptimal {

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


        public Node LCA(Node root,int n1,int n2){
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
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildTree(nodes);

        System.out.print(tree.LCA(root,4,5).data);
    }
}
