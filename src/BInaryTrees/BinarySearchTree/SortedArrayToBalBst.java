package BInaryTrees.BinarySearchTree;

public class SortedArrayToBalBst {

    static class Node{
        int val;Node left,right;
        Node(int val){
            this.val=val;
        }
    }

    static class binarySearchTree{
        public Node buildBalTree(int[] nodes,int st, int ed){
            if(st>ed){
                return null;
            }
            int mid = st+(ed-st) / 2;
            Node root=new Node(nodes[mid]);
            root.left=buildBalTree(nodes, st, mid -1);
            root.right=buildBalTree(nodes, mid +1,ed);
            return root;
        }

        public void Inorder(Node root){
            if(root==null) return;
            Inorder(root.left);
            System.out.print(root.val+" ");
            Inorder(root.right);
        }
    }
    public static void main(String[] args) {
        int nodes[]={3,5,6,8,10,11,12};
        binarySearchTree tree=new binarySearchTree();

        tree.Inorder(tree.buildBalTree(nodes,0 ,nodes.length-1));
    }
}
