package Stacks.Basics;

public class StacksUsingLinkedList {
    public static class Stacks{

        public boolean IsEmpty(){
            return head==null;
        }
        public void Push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public int Pop(){
            if(head==null) return -1;

            int top=head.data;
            head=head.next;
            return top;
        }

        public int Peek(){
            if(head==null) return-1;
            return head.data;
        }
        public static class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        public Node head;
    }
    public static void main(String[] args) {
        Stacks s=new Stacks();
        s.Push(1);
        s.Push(2);
        s.Push(3);

        while(!s.IsEmpty()){
            System.out.println(s.Pop());
        }
    }
}
