package Recursion.Backtracking;

public class KeyPad {

    public static void Solve(char keypad[][],String num,StringBuilder ans,int pos){
        if(pos==num.length()){
            System.out.println(ans);
            return;
        }
        char Letters[]=keypad[Character.getNumericValue(num.charAt(pos))];

        for(int i=0;i<Letters.length;i++){
            ans.append(Letters[i]);
            Solve(keypad,num,ans,pos+1);
            ans.deleteCharAt(ans.length()-1); //Backtrack
        }
    }
    public static void main(String[] args) {
        char keypad[][]={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        String num="243";
        if(num.isEmpty()){
            System.out.println("");
        }
        Solve(keypad,num,new StringBuilder(""),0);
    }
}
