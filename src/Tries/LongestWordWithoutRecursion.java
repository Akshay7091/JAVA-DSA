package Tries;
public class LongestWordWithoutRecursion {
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
    private static int prefixCount(String word) {
        Node curr = root;
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.child[idx] == null) return 0;

            curr = curr.child[idx];

            if (!curr.eow) {
                return 0;
            }

            count++;
        }
        return count;
    }

    public static void Longest(String[] words){
        String ans = "";

        for (String word : words) {
            int cnt = prefixCount(word);

            if (cnt != word.length()) continue;

            if (word.length() > ans.length() ||
                    (word.length() == ans.length() && word.compareTo(ans) < 0)) {
                ans = word;
            }
        }
        System.out.print(ans);
    }
    public static void main(String[] args) {
        String[] words={"a","banana","ap","appl","app","apply","apple"};

        for(String word:words){
            insert(word);
        }
        Longest(words);
   }
}
