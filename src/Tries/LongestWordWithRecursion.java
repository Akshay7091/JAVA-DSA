package Tries;

public class LongestWordWithRecursion {

    public static class Node{
        Node[] child=new Node[26];
        boolean eow=false;
    }

    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.child[idx]==null){
                curr.child[idx]=new Node();
            }
            curr=curr.child[idx];
        }
        curr.eow=true;
    }

    public static StringBuilder ans=new StringBuilder();
    public static void longest(Node root,StringBuilder temp){
        if(root==null) return;
        for(int i=0;i<root.child.length;i++){
            if(root.child[i]!=null && root.child[i].eow){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length()>ans.length()){
                    ans=new StringBuilder(temp);
                }
                longest(root.child[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String[] words={"a","banana","ap","appl","app","apply","apple"};

        for(String word:words){
            insert(word);
        }
        ans=new StringBuilder();
        longest(root,new StringBuilder());
        System.out.print(ans);
    }
}
