package Stacks.Basics;

import java.util.ArrayList;

public class StackUsingArrayList {
    public static class Stacks{
        static ArrayList<Integer> arr=new ArrayList<>();

        public boolean IsEmpty(){
            return arr.isEmpty();
        }

        public void Push(int data){
            arr.add(data);
        }

        public int Pop(){
            if(IsEmpty()){
                return -1;
            }
            int top=arr.get(arr.size()-1);
            arr.remove(arr.get(arr.size()-1));
            return top;
        }

        public int Peek(){
            if(IsEmpty()) return -1;
            return arr.get(arr.size()-1);
        }
    }
    public static void main(String[] args) {
        Stacks s=new Stacks();
        System.out.println(s.IsEmpty());
        s.Push(1);
        s.Push(2);
        s.Push(3);
        System.out.println(s.IsEmpty());

        while(!s.IsEmpty()) System.out.println(s.Pop());
        System.out.println(s.IsEmpty());
    }
}
