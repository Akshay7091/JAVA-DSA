package Queues.Implementation;

public class CircularQueueStandardway {
    static class Queue{
        int arr[];
        int size;
        int rear;int front;

        Queue(int n){
            arr=new int [n];
            size=n;
            rear=-1;front=-1;
        }
        public boolean IsEmpty(){
            return front==-1;
        }
        public boolean IsFull(){
            return rear+1%size==front;
        }
        public void push(int data){
            if(IsFull()){
                System.out.print("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public void pop(){
            if(IsEmpty()){
                System.out.print("Queue is Empty");
                return;
            }
            if(front==rear){
                front=rear=-1;
            }
            else{
                front=front+1%size;
            }

        }

        public int peek(){
            if(IsEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CircularQueueMyWay.Queue q=new CircularQueueMyWay.Queue(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);

        while(!q.IsEmpty()){
            System.out.print(q.peek()+ " ");
            q.pop();
        }
    }
}
