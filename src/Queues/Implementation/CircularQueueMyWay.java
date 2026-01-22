package Queues.Implementation;

public class CircularQueueMyWay {
    static class Queue{
        int arr[];
        int size;
        int rear,front;
        Queue(int n){
            arr=new int [n];
            size=n;
            rear=-1;front=-1;
        }
        public boolean IsEmpty(){
            return rear==-1;
        }
        public boolean IsFull(){ return rear+1==front || (front==0 && rear==size-1);}
        public void push(int data){
            if(IsFull()){
                System.out.print("Queue is full");
                return;
            }
            if(IsEmpty()){
                rear=0;
                front=0;
            }
            else if(rear==size-1){
                rear=0;
            }
            else{
                rear++;
            }
            arr[rear]=data;
        }
        public void pop(){
            if(IsEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            if(front==rear){
                rear=-1;front=-1;
            }
            else if(front==size-1){
                front=0;
            }
            else{
                front++;
            }
        }
        public int peek(){
            if(IsEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
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
