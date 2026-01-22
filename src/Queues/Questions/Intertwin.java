package Queues.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Intertwin {

    public static Queue<Integer> Output(Queue<Integer> oq){
        int size=oq.size();
        Queue<Integer> fq=new LinkedList<>();
        for(int i=0;i<size/2;i++){
            fq.offer(oq.poll());
        }

        while(!fq.isEmpty()){
            oq.offer(fq.poll());
            oq.offer((oq.poll()));
        }
        return oq;
    }
    public static void main(String[] args) {
        Queue<Integer> oq=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if(num%2!=0) return;
        for(int i=1;i<=num;i++){
            oq.offer(i);
        }
        Queue<Integer> resq=Output(oq);
        while(!resq.isEmpty()){
            System.out.print(resq.poll()+" ");
        }
    }
}
