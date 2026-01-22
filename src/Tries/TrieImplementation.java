package Tries;

public class TrieImplementation {

    public static class Node{
        Node[] chars=new Node[26];
        boolean eow=false;
    }

    public static Node root=new Node();

    static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.chars[idx]==null){
                curr.chars[idx]=new Node();
            }
            curr=curr.chars[idx];
        }
        curr.eow=true;
    }

    static boolean search(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.chars[idx]==null){
                return false;
            }
            curr=curr.chars[idx];
        }

        return curr.eow;
    }

    static boolean startsWith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.chars[idx]==null){
                return false;
            }
            curr=curr.chars[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words={"the","they","there","their","any"};

        for (String word : words) {
            insert(word);
        }

        System.out.println(search("any"));
        System.out.println(search("tp"));
        System.out.println(startsWith("th"));
        System.out.print(startsWith("tp"));
    }
}
