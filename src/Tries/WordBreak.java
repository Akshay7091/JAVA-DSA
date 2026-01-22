package Tries;

public class WordBreak {

    public static class Node{
        Node[] Child=new Node[26];
        boolean eow=false;
    }
    public static Node root=new Node();

    static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.Child[idx]==null){
                curr.Child[idx]=new Node();
            }
            curr=curr.Child[idx];
        }
        curr.eow=true;
    }

    static boolean search(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.Child[idx]==null) return false;

            curr=curr.Child[idx];
        }

        return curr.eow;
    }
    static boolean isPresent(String key){
        if(key.isEmpty()) return true;
        for(int i=1;i<=key.length();i++){
            if(search(key.substring(0,i)) && isPresent(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] words={"i","like","apple","mobile","mobilization"};
        String key="ilikeapple";
        for(String word:words){
            insert(word);
        }

        System.out.print(isPresent(key));
    }
}
