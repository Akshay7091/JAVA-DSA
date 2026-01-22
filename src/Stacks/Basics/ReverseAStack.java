package Stacks.Basics;

import java.util.Stack;

public class ReverseAStack {
    public static void PushAtBottom(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        PushAtBottom(s,data);
        s.push(top);
    }
    public static void Reverse(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int top=s.pop();
        Reverse(s);
        PushAtBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        Reverse(s);
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}
