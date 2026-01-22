package Queues.Implementation;

public class Arrays {
    static class Queue{
       public int arr[];
        public int size;
        public int rear;
        Queue(int n){
            arr=new int [n];
            size=n;
            rear=-1;
        }
        public boolean Isempty(){
            return rear==-1;
        }
        public void Push(int data){
            if(rear==size-1){
                System.out.print("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        public int pop(){
            if(rear==-1){
                System.out.println("Queue is empty");
                return -1;
            }
            int ele=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return ele;
        }
        public int peek(){
            if(rear==-1){
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.Push(1);
        q.Push(2);
        q.Push(3);
        q.Push(4);
        q.Push(5);
        while(!q.Isempty()){
            System.out.print(q.peek()+ " ");
            q.pop();
        }
    }
}


