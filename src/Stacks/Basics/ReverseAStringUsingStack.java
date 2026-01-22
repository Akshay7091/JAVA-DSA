package Stacks.Basics;

import java.util.Stack;

public class ReverseAStringUsingStack {

    public static String Reverse(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        StringBuilder res=new StringBuilder("");
        while(!s.empty()){
            res.append(s.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str="akshay";
        System.out.print(Reverse(str));
    }
}
