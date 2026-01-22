package Linkedlist.Part2;

public class DoubleLL {

    private void AddFirst(int data){
        ListNode NewNode=new ListNode(data);
        if(head==null){
            head=tail=NewNode;
            return;
        }
        NewNode.next=head;
        head.prev=NewNode;
        head=NewNode;
    }

    private void AddAtLast(int data){
        ListNode NewNode=new ListNode(data);
        if(head==null){
            head=tail=NewNode;
            return;
        }
        tail.next=NewNode;
        tail.prev=NewNode;
        tail=NewNode;
    }

    private void PrintDLL(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data +"<==>");
            temp=temp.next;
        }
        System.out.print("null");
    }
    private static class ListNode{
        int data;
        ListNode next;
        ListNode prev;

        ListNode(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    private ListNode head;
    private ListNode tail;

    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.AddFirst(2);
        dll.AddFirst(1);
        dll.AddAtLast(3);
        dll.AddAtLast(4);
        dll.AddAtLast(5);
        dll.PrintDLL();
    }
}
