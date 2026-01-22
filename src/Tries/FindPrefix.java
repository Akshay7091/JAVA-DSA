package Tries;
import java.util.*;
public class FindPrefix {

    static class Node{
        Node[] child=new Node[26];
        boolean eow=false;
        int freq=0;
    }

    static Node root = new Node();
    public static void insert(String word){
        Node curr=root;
        curr.freq++;  //this will increment our only root's frequency
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.child[idx]==null){
                curr.child[idx]=new Node();
            }
            curr=curr.child[idx];
            curr.freq++;
        }
        curr.eow=true;
    }

    private static void findPrefix(Node root,String ans,List<String> res){
        if(root==null) return;

        if(root.freq==1){
            res.add(ans);
            return;
        }

        for(int i=0;i<root.child.length;i++){
            if(root.child[i]!=null){
                findPrefix(root.child[i],ans+(char)(i+'a'),res);
            }
        }
    }
    public static void main(String[] args) {
        String[] words = {"zebra", "dog", "duck", "dove","steve"};
        for(String word:words){
            insert(word);
        }
        List<String> res=new ArrayList<>();
        findPrefix(root,"",res);

        for(String val:res){
            System.out.print(val+" ");
        }

        System.out.println(root.freq);
    }
}
