package BInaryTrees.Part2;

public class DiaOfBTree {

    static class Node{
        Node left,right;int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
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

        public int Height(Node root){
            if(root==null){
                return 0;
            }

            return Math.max(Height(root.left),Height(root.right))+1;
        }

        public int Diameter(Node root){
            if(root==null){
                return 0;
            }
            int ld=Diameter(root.left);
            int lh=Height(root.left);
            int rd=Diameter(root.right);
            int rh=Height(root.right);

            int d=lh+rh+1;

            return Math.max(d,Math.max(ld,rd));
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree1=new BinaryTree();
        Node root=tree1.BuildTree(nodes);

        System.out.print(tree1.Diameter(root));
    }
}
