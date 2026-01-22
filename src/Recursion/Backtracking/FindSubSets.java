package Recursion.Backtracking;
// There is no backtracking in this problem
public class  FindSubSets {
    public static void Sub(StringBuilder str,int i,String ans){
        if(i==str.length()){
            System.out.print(ans+" ");
            return;
        }

        Sub(str,i+1,ans+str.charAt(i));
        Sub(str,i+1,ans);
    }
    public static void main(String[] args) {
        String str="abc";
        Sub(new StringBuilder(str),0,"");
    }
}
