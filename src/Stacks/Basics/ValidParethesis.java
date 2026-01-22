package Stacks.Basics;

import java.util.Stack;

public class ValidParethesis {

    protected static boolean IsValid(String s){
        Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
               st.push(s.charAt(i));
           }

           else{
               if(st.empty()) return false;
               if    (s.charAt(i)==')' && st.peek()!='(' ||
                       s.charAt(i)=='}' && st.peek()!='{'||
                       s.charAt(i)==']' && st.peek()!='[') {
                   return false;
               }
               st.pop();
           }
       }

       return st.empty();
    }
    public static void main(String[] args) {
        String ip="([])";
        System.out.print(IsValid(ip));
    }
}
