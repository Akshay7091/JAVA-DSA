package Recursion.BasicsPart2;

public class RemoveDuplicates {

    public static StringBuilder Remove(String str,StringBuilder st,int idx,boolean stt[]){
        if(idx==str.length()){
            return st;
        }
        if(!stt[str.charAt(idx)-'a']){
            stt[str.charAt(idx)-'a']=true;
            st.append(str.charAt(idx));
            Remove(str,st,idx+1,stt);
        }
        else{
            Remove(str,st,idx+1,stt);
        }
        return st;
    }
    public static void main(String[] args) {
        String str="appnnacollege";
        System.out.print(Remove(str,new StringBuilder(),0,new boolean[26]));
    }
}
