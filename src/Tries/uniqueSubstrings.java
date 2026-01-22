package Tries;

public class uniqueSubstrings {

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
    public static int Nodes(Node curr){
        if(curr==null) return 0;
        int count=0;
        for(int i=0;i<curr.child.length;i++){
            if(curr.child[i]!=null){
                count+=Nodes(curr.child[i]);
            }
        }
        return count+1;
    }
    public static int Unique(String word){
        for(int i=0;i<word.length();i++){
            insert(word.substring(i));
        }

        return Nodes(root);
    }
    public static void main(String[] args) {
        String word="ababa";
        System.out.print(Unique(word));
    }
}
