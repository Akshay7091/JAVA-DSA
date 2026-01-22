package Queues.Questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NonRepeatingChars {
    public static String Output(String str){
        StringBuilder sb=new StringBuilder("");
        Queue<Character>q=new LinkedList<>();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
            q.offer(str.charAt(i));
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.poll();
            }
            if(q.isEmpty()) sb.append("-1").append(" ");
            else sb.append(q.peek()).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aabccxb";
        System.out.print(Output(str));
    }
}
