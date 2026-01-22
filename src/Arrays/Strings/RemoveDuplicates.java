package Arrays.Strings;

public class RemoveDuplicates {

    public static void Remove(String str){
        StringBuilder st=new StringBuilder();
        boolean seen[]=new boolean[26];

        for(int i=0;i<str.length();i++){
            if(!seen[str.charAt(i)-'a']){
                st.append(str.charAt(i));
                seen[str.charAt(i)-'a']=true;
            }
        }
        System.out.print(st);
    }
    public static void main(String[] args) {
        String str="appnacollege";
        Remove(str);
    }
}
