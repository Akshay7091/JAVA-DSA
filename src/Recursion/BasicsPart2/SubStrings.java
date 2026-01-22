package Recursion.BasicsPart2;

public class SubStrings {

    public static  void Sub(String str,int st,int ed){
        if(st==str.length()){
            return;
        }
        if(ed==str.length()){
            Sub(str,st+1,st+1);
            return;
        }
        System.out.print(str.substring(st,ed+1) + " ");
        Sub(str,st,ed+1);
    }
    public static void main(String[] args) {
        String str="abcab";
        Sub(str,0,0);
    }
}
