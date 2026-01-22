package Linkedlist.Part2;

public class LinkedList2 {

    public void AddAtFirst(int data){
        ListNode NewNode=new ListNode(data);
        if(head==null){
            head=tail=NewNode;
            return;
        }
        NewNode.next=head;
        head=NewNode;
    }
    public void AddAtLast(int data){
        ListNode NewNode=new ListNode(data);
        if(head==null){
            head=tail=NewNode;
            return;
        }
        tail.next=NewNode;
        tail=NewNode;
    }
    public void MakeLLCircular(ListNode head){
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
    }
    public static void RemoveCircular(ListNode head){
        ListNode slow=head,fast=head;boolean Cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                Cycle=true;
                break;
            }
        }
        if(!Cycle){
            return;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        while(fast.next!=slow){
            fast=fast.next;
        }
        fast.next=null;
    }
    public static boolean IsCircular(ListNode head){
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public ListNode Merge(ListNode headL,ListNode headR){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode tempA= headL,tempB= headR;
        while(tempA!=null && tempB!=null){
            if(tempA.data>=tempB.data){
                temp.next=tempB;
                tempB=tempB.next;
            }
            else{
                temp.next=tempA;
                tempA=tempA.next;
            }
            temp = temp.next;
        }

        while(tempA!=null){
            temp.next=tempA;
            tempA=tempA.next;
            temp = temp.next;
        }
        while(tempB!=null){
            temp.next=tempB;
            tempB=tempB.next;
            temp = temp.next;
        }
        return dummy.next;
    }
    public ListNode MergeSort(ListNode head){
        if( head.next==null){
            return head;
        }
        ListNode headA=head;
        ListNode slow=head,Fast=head.next;
        while(Fast!=null && Fast.next!=null){
            slow=slow.next;
            Fast=Fast.next.next;
        }
        ListNode headB=slow.next;
        slow.next=null;
        ListNode left=MergeSort(headA);
        ListNode right=MergeSort(headB);
        return Merge(left,right);
    }


    public ListNode ZigZag(ListNode headL){
        if (headL == null || headL.next == null) return headL;
        ListNode slow=headL,fast=headL;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode headR=slow.next;
        slow.next=null;
        ListNode prev=null,curr=headR;
        while(curr!=null){
            ListNode Next=curr.next;
            curr.next=prev;
            prev=curr;curr=Next;
        }
        headR=prev;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(headL!=null && headR!=null){
            temp.next=headL;headL=headL.next;temp=temp.next;
            temp.next=headR;headR=headR.next;temp=temp.next;
        }
        while(headL!=null){
            temp.next=headL;headL=headL.next;temp=temp.next;
        }
        while(headR!=null){
            temp.next=headR;headR=headR.next;temp=temp.next;
        }
        return dummy.next;
    }

    public void DeleteMnodesAfterNnodes(ListNode head,int m,int n){
        int countM=m,countN=n;
        ListNode curr=head,prev=null;boolean flag=true;ListNode temp=null;
        while(curr!=null && n>0){
            if(countM==0){
                flag=false;
                countM=m;
                temp=prev;
            }
            if(countN==0){
                flag=true;
                countN=n;
                temp.next=curr;
            }
            if(flag){
                countM--;
            }
            else{
                countN--;
            }
            prev=curr;
            curr=curr.next;
        }
    }
    public void PrintLL(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public ListNode head;
    public ListNode tail;

    public static void main(String[] args) {
        LinkedList2 ll1 =new LinkedList2();
        ll1.AddAtFirst(1);
        ll1.AddAtLast(2);
        ll1.AddAtLast(3);
        ll1.AddAtLast(4);
        ll1.AddAtLast(5);
        ll1.PrintLL();
        System.out.println();

        ll1.MakeLLCircular(ll1.head);
        //ll1.PrintLL(); this will run infinite so we cant print a circular linkedList by a Normal PrintLL() method


        System.out.print("Is the ll circular after calling MakeLLCircular Method: "+IsCircular(ll1.head)); // at first out ll1 was normal LL but when we call ll1.MakeLLCircular(ll1.head) Method
        System.out.println();                  //It made the LL circular so we're getting true as our output
        RemoveCircular(ll1.head);
        System.out.print("Is the ll circular after calling the Pop Circular function: "+IsCircular(ll1.head));
        System.out.println();
        ll1.PrintLL();
        System.out.println();


        LinkedList2 ll2=new LinkedList2();
        ll2.AddAtLast(6);
        ll2.AddAtLast(3);
        ll2.AddAtLast(9);
        ll2.AddAtLast(5);
        ll2.AddAtLast(2);
        ll2.AddAtLast(8);
        ll2.PrintLL();
        System.out.println();

        ll2.head=ll2.MergeSort(ll2.head);
        ll2.PrintLL();
        System.out.println();

        LinkedList2 ll3=new LinkedList2();
        ll3.AddAtFirst(1);
        ll3.AddAtLast(2);
        ll3.AddAtLast(3);
        ll3.AddAtLast(4);
        ll3.AddAtLast(5);
        ll3.AddAtLast(6);
//        ll3.AddAtLast(7);
//        ll3.AddAtLast(8);
//        ll3.AddAtLast(9);
//        ll3.AddAtLast(10);
        ll3.PrintLL();
        System.out.println();
        ll3.head=ll3.ZigZag(ll3.head);
        ll3.PrintLL();
        System.out.println();
        System.out.println();

        LinkedList2 ll4=new LinkedList2();
        ll4.AddAtFirst(1);
        ll4.AddAtLast(2);
        ll4.AddAtLast(3);
        ll4.AddAtLast(4);
        ll4.AddAtLast(5);
        ll4.AddAtLast(6);
        ll4.AddAtLast(7);
        ll4.AddAtLast(8);
        ll4.AddAtLast(9);
        ll4.AddAtLast(10);
        ll4.PrintLL();

        ll4.DeleteMnodesAfterNnodes(ll4.head,3,1);
        System.out.println();
        ll4.PrintLL();
    }
}
