package Queues.Implementation;
import java.util.*;

public class ArrayLists {
    static class Queue{
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
            int ele=arr.get(0);
            arr.remove(0);
            return ele;
        }
        public int Peek(){
            return arr.get(0);
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.Push(1);
        q.Push(2);
        q.Push(3);
        while(!q.IsEmpty()){
            System.out.println(q.Peek());
            q.Pop();
        }
    }
}
