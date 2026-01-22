package Arrays.Strings;

public class ConvertLetterToUpperCase {
    public static StringBuilder Upper(String str){
        StringBuilder st=new StringBuilder("");
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)<(int) 'a' || str.charAt(i)>(int) 'z' ){
                st.append(str.charAt(i));
            }
            else{
                char ch=(char) (str.charAt(i)-'a'+'A');
                st.append(ch);
            }
        }
        return st;
    }
    public static void main(String[] args) {
        String str="hi i am Akshay";
        System.out.print(Upper(str));
    }
}
