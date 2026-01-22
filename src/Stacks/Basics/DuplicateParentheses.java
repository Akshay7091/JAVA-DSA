package Stacks.Basics;

import java.util.Stack;

public class DuplicateParentheses {

    protected static boolean IsDuplicate(String str){
        Stack<Character> st=new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=')'){
                st.push(str.charAt(i));
            }
            else{
                int count=0;
                while(st.peek()!='(') {
                    st.pop();
                    count++;
                }
                st.pop();
                if(count<1){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s="(((a)-(b)))";
        System.out.print(IsDuplicate(s));
    }
}
