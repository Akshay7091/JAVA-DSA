package Stacks.Basics;

import java.util.Stack;

public class SimplifyPath {

    public static String Simplify(String path){
        String helper[]=path.split("/");
        StringBuilder res=new StringBuilder();
        Stack<String> stk=new Stack<>();int i=0;
        for(String s:helper){
            if(s.equals("..") && !stk.empty()){
                stk.pop();
            }
            else if(!s.equals(".") && !s.equals("")){
                stk.push(s);
            }
        }
        for(String t:stk){
            res.append("/").append(t);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println(Simplify("/h/users/doc/../pic/"));
    }
}
