package BInaryTrees.BinarySearchTree;

public class SizeOfLargestBSTInBTOptimal {

    static class binaryTree{
        public static class Node{
            int val;Node left,right;
            Node(int data){
                this.val=data;
            }
        }
        int ansSize=0;
        static class Info{
            boolean IsValid;int size,min,max;
            Info(boolean isValid,int size,int min,int max){
                this.IsValid=isValid;
                this.size=size;
                this.min=min;
                this.max=max;
            }
        }
        int idx=-1;
        public Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node NewNode=new Node(nodes[idx]);
            NewNode.left=buildTree(nodes);
            NewNode.right=buildTree(nodes);
            return NewNode;
        }
        public Info largestBST(Node root){
            if(root==null) return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);

            Info l = largestBST(root.left);
            Info r = largestBST(root.right);

            if(l.IsValid && r.IsValid && root.val > l.max && root.val < r.min){
                ansSize=Math.max(ansSize, l.size+ r.size+1);
                int minVal = Math.min(root.val, l.min);
                int maxVal = Math.max(root.val, r.max);
                return new Info(true, l.size+ r.size+1, minVal, maxVal);
            }
            return new Info(false,0,0,0); // if the current subtree is not valid
            // then what's the point of returning its Info
        }
    }
    public static void main(String[] args) {
        int[] nodes ={50,30,5,-1,-1,20,-1,-1,60,45,-1,-1,70,65,-1,-1,80,-1,-1};
        binaryTree tree=new binaryTree();
        binaryTree.Node root=tree.buildTree(nodes);
        tree.largestBST(root);
        System.out.print(tree.ansSize);
    }
}
