package BInaryTrees.Part2;

public class DiaOfBTreeOptimalUsingGlobalV {
    static int dia=0;
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

        // REMEMBER THIS IS OPTIMIZED BUT HAVING GLOBAR VARIABLE IN YOUR CODE IS USUALLY
        // NOT GOOD SO WHEN SPECIFICALLY ASKED FOR DIAMETER USE THE OTHER OPTIMIZED DIAMETER SOLUTION
        //USE THIS APPROACH WHEN RETURL VALUE IS NOT EQUAL TO ANSWER
        public int Diameter(Node root){
            dia=0;
            height(root);
            return dia;
        }
        public int height(Node root){
            if(root==null) return 0;
            int leftH= height(root.left),rightH= height(root.right);
            dia=Math.max(dia,leftH+rightH+1);

            return Math.max(leftH,rightH)+1;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        binaryTree tree=new binaryTree();
       Node root= tree.buildTree(nodes);

        System.out.print(tree.Diameter(root));
    }
}
