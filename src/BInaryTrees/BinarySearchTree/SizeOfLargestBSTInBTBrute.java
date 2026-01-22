package BInaryTrees.BinarySearchTree;
public class SizeOfLargestBSTInBTBrute {

    static class Node{
        int val;Node right,left;
        Node(int val){
            this.val=val;
        }
    }

    static class binarySearchTree{
        int size=0;int idx=-1;
        public Node buildBTTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left=buildBTTree(nodes);
            newNode.right=buildBTTree(nodes);
            return newNode;

        }

        public boolean isValid(Node root,long min,long max){
            if(root==null) return true;

            if(root.val<=min || root.val>=max) return false;

            return isValid(root.left,min,root.val) && isValid(root.right,root.val,max);
        }
        public int CalSize(Node root){
            if(root==null) return 0;
            return CalSize(root.left)+CalSize(root.right)+1;
        }
        public void Sizee(Node root){
            if(root==null) return;

            if(isValid(root,Long.MIN_VALUE,Long.MAX_VALUE)){
                size=Math.max(size,CalSize(root));
            }
            else{
                Sizee(root.left);
                Sizee(root.right);
            }
        }
    }
    public static void main(String[] args) {
        int nodes[]={50,30,5,-1,-1,20,-1,-1,60,45,-1,-1,70,65,-1,-1,80,-1,-1};
        binarySearchTree tree=new binarySearchTree();
        Node root=tree.buildBTTree(nodes);
        tree.Sizee(root);
        System.out.print(tree.size);

        //TC WIll be O(n^2)
    }
}
