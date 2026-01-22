package BInaryTrees.Part2;

public class DiaOfBTreeOptimized {

    static class Node{
        int data;Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class Info{
        int dia,ht;
        Info(int dia,int ht){
            this.dia=dia;
            this.ht=ht;
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

        public Info Diameter(Node root){
            if(root==null){
                return new Info(0,0);
            }

            Info lInfo=Diameter(root.left);
            Info rInfo=Diameter(root.right);

            int Dia=Math.max(Math.max(lInfo.dia,rInfo.dia),lInfo.ht+rInfo.ht+1);
            int ht=Math.max(lInfo.ht,rInfo.ht)+1;

            return new Info(Dia,ht);
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree1=new BinaryTree();
        Node root=tree1.BuildTree(nodes);
        System.out.print(tree1.Diameter(root).dia);

    }
}
