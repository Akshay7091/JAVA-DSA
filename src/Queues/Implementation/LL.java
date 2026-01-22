package Queues.Implementation;

public class LL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
            this.val=data;
            this.next=null;
        }
    }
    static class Queue{
        ListNode head=null,tail=null;
        public boolean ISEmpty(){
           return head==null && tail==null;
        }

        public void push(int data){
            ListNode NewNode=new ListNode(data);
            if(ISEmpty()){
                head=tail=NewNode;
                return;
            }
            tail.next=NewNode;
            tail=NewNode;
        }

        public void pop(){
            if(ISEmpty()){
                System.out.print("Queue is Empty");
                return;
            }
            if(head==tail){
                head=tail=null;
            }
            else{
                head=head.next;
            }
        }

        public int peek(){
            if(ISEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            return head.val;
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.pop();
        while(!q.ISEmpty()){
            System.out.print(q.peek() + " ");
            q.pop();
        }
    }
}
