package Queues.GreedyAlgorithms;

public class FractionalKnapsack {

    public static int Output(int v[],int w[],int W){
        int res=0;
        for(int i=0;i<v.length;i++){
            if(w[i]>W){
                res=res+(W/w[i])*v[i];
            }
            else{
                res+=v[i];
            }
            W=W-w[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int v[]={60,100,120},w[]={10,20,30};
        int W=50;

        System.out.print(Output(v,w,W));
    }
}
