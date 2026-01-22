package Arrays.Strings;

public class StringCompression {
    public static void LowerCaseVowels(StringBuilder st){
        int count=0;
        for(int i=0;i<=st.length()-1;i++){
            if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='o' || st.charAt(i)=='u' || st.charAt(i)=='i'){
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        String str="aecAifg";
        StringBuilder st=new StringBuilder(str);
        LowerCaseVowels(st);
    }
}
