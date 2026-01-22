package Stacks.Basics;

import java.util.*;
public class PushAtTheBottomOfStack {

    public static void PushAtBottom(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        PushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

//        while(!s.empty()){
//            System.out.println(s.pop());
//        }

        PushAtBottom(s,0);

        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}
