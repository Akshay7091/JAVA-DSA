package BInaryTrees.Part1;

public class SumOfTheNodes {
    static class Node{
        int data;Node left,right;
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

        public int Sum(Node root){
            if(root==null){
                return 0;
            }
            return root.data + Sum(root.left) + Sum(root.right);
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree1=new BinaryTree();
        Node root=tree1.BuildTree(nodes);

        System.out.print(tree1.Sum(root));
    }
}
