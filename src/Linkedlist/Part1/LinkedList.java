package Linkedlist.Part1;

// Basic Creation of a LinkedList
public class LinkedList {


    public int Size(){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public void AddAtFirst(int data){ // Adding an element at first of the list(making the given node head of the list)
        Node NewNode=new Node(data);

        if(head==null){
            head=tail=NewNode;
            return;
        }
        NewNode.next=head;
        head=NewNode;
    }

    public void AddAtLast(int data){
        Node NewNode=new Node(data);
        if(head==null){
            head=tail=NewNode;
            return;
        }
        tail.next=NewNode;
        tail=NewNode;
    }

    public void AddAtMiddle(int data){
        Node NewNode=new Node(data);
        if(head==null){
            head=tail=NewNode;
            return;
        }

        int length=Size();

        int middle=length/2;

        Node temp =head;
        for(int i=1;i<middle;i++){
            temp = temp.next;
        }

        NewNode.next= temp.next;
        temp.next=NewNode;

        if(NewNode.next==null){
            tail=NewNode;
        }
    }

    public void SomeWhereInBetween(int index,int data){
        if(index < 0) {
            System.out.println("Invalid index");
            return;
        }
        Node NewNode=new Node(data);
        if(index == 0){
            AddAtFirst(data);
            return;
        }

        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
       NewNode.next=temp.next;temp.next=NewNode;

       if(NewNode.next==null){
           tail=NewNode;
       }
    }
    public void RemoveFirst(){
        if(Size()==0){
            System.out.println("LL is Empty");
            return;
        }
        head=head.next;

        if(head==null){
            tail=null;
        }
    }

    public void RemoveLast(){
        if(Size()==0){
            System.out.print("LL is Empty");
            return;
        }
        if(Size()==1){
            head=tail=null;
        }
        else{
            Node temp=head;
            for(int i=0;i<Size()-2;i++){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
    }
    public void RemoveNthFromLast(int n){
        if(n>Size()){
            System.out.println("non Valid Node");
            return;
        }
        int idx=Size()-n;
        if(idx==0){
            head=head.next;
            if(head==null) tail=null;
            PrintLL();
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(temp.next==null){
            tail=temp;
        }
        PrintLL();
    }


    public int ISearch(int key){
        Node temp=head;int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;i++;
        }
        return -1;
    }


    public int helper(Node temp,int key){
        if(temp==null){
            return -1;
        }
        if(temp.data==key){
            return 0;
        }
        if(helper(temp.next,key)==-1){
            return -1;
        }
        return 1+helper(temp.next,key);
    }
    public int Rsearch(int key){
        Node temp=head;
        return helper(temp,key);
    }


    public void Reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prev=null;Node curr=head;Node oldHead=head;
        while(curr!=null){
            Node Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        head=prev;
        tail=oldHead;
    }
    
    public void PrintLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static class Node { // BluePrint For the creation of nodes
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.head=new Node(2);
        ll.head.next=new Node(3);
        ll.head.next.next=new Node(4);
        ll.tail=ll.head.next.next;
        ll.PrintLL();
        System.out.println();

        ll.AddAtFirst(1);
        ll.PrintLL();
        System.out.println();

        ll.AddAtLast(5);
        ll.PrintLL();
        System.out.println();

        ll.AddAtMiddle(6);
        ll.PrintLL();
        System.out.println();

        ll.SomeWhereInBetween(2,9);
        ll.PrintLL();
        System.out.println();
        ll.RemoveFirst();

        ll.PrintLL();
        System.out.println();

        ll.RemoveLast();
        ll.PrintLL();
        System.out.println();
        System.out.println(ll.Size());

        System.out.println(ll.ISearch(6));

        System.out.println(ll.Rsearch(10));

        ll.Reverse();
        ll.PrintLL();
        System.out.println();

        ll.RemoveNthFromLast(5);
    }
}
