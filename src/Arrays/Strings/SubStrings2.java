package Arrays.Strings;

public class SubStrings2 {

    public static void Sub(String str,int st,int ed){
        if(st==str.length()){
            return;
        }
        if(ed==str.length()){
            Sub(str,st+1,st+1);
            return;
        }
//        if(str.charAt(st)==str.charAt(ed)){
//            System.out.print(str.substring(st,ed+1)+" ");
//        }
        System.out.print(str.substring(st,ed+1)+" ");
        Sub(str,st,ed+1);
    }
    public static void main(String[] args) {
        String str="abc";
        Sub(str,0,0);
    }
}
