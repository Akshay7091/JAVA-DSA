package Recursion.Backtracking;

public class Permutations {

    public static void Permutation(String str,String ans){
        if(str.isEmpty()){
            System.out.print(ans +" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            String NewStr=str.substring(0,i) +str.substring(i+1);
            Permutation(NewStr,ans+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="abc";
        Permutation(str,"");
    }
}
