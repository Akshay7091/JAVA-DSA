package BInaryTrees.BinarySearchTree;

import java.util.ArrayList;

public class MergeTwoBSTs {

    static class Node{
        int val;Node left,right;
        Node(int val){
            this.val=val;
        }
    }

    static class binarySearchTree{
        public void printPreorder(Node root){
            if(root==null) return;
            System.out.print(root.val+" ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
        public void Inorder(Node root, ArrayList<Integer> arr){
            if(root==null) return;

            Inorder(root.left,arr);
            arr.add(root.val);
            Inorder(root.right,arr);
        }

        public ArrayList<Integer> Mergearr(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
            ArrayList<Integer> ans=new ArrayList<>();

            int i=0,j=0;
            while(i<arr1.size() && j< arr2.size()){
                if(arr1.get(i) <arr2.get(j)){
                    ans.add(arr1.get(i));
                    i++;
                }
                else{
                    ans.add(arr2.get(j));
                    j++;
                }
            }

            while (i< arr1.size()){
                ans.add(arr1.get(i));
                i++;
            }
            while(j< arr2.size()){
                ans.add(arr2.get(j));
                j++;
            }
            return ans;
        }
        public Node buildMergedTree(ArrayList<Integer> nodes,int st,int ed){
            if(st>ed) return null;
            int mid=st+(ed-st)/2;
            Node root=new Node(nodes.get(mid));
            root.left=buildMergedTree(nodes,st,mid-1);
            root.right=buildMergedTree(nodes,mid+1,ed);

            return root;
        }
        public Node mergeTrees(Node root1,Node root2){
            ArrayList<Integer> arr1=new ArrayList<>();
            ArrayList<Integer> arr2=new ArrayList<>();
            Inorder(root1,arr1);
            Inorder(root2,arr2);
            ArrayList<Integer> mergedArray=Mergearr(arr1,arr2);
            root1=buildMergedTree(mergedArray,0, mergedArray.size()-1);
            return root1;
        }
        public Node buildTree(Node root,int val){
            if(root==null) return new Node(val);
            if(val>root.val){
                root.right=buildTree(root.right,val);
            }
            if(val<root.val){
                root.left=buildTree(root.left,val);
            }
            return root;
        }
    }
    public static void main(String[] args) {
        int nodes1[]={2,1,4},nodes2[]={9,3,12};
        binarySearchTree tree1=new binarySearchTree();
        Node root1=null;
        for(int val:nodes1){
            root1=tree1.buildTree(root1,val);
        }
        binarySearchTree tree2=new binarySearchTree();
        Node root2=null;
        for(int val:nodes2){
            root2=tree2.buildTree(root2,val);
        }
        Node mergedRoot=tree1.mergeTrees(root1,root2);
        tree1.printPreorder(mergedRoot);

    }

}
