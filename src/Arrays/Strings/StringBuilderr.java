package Arrays.Strings;

public class StringBuilderr {

    public static void NormalString(String str){  // TIME COMPLEXITY= O(26 * n^2) since the new string is created on every change
        for(char i='a';i<='z';i++){
            str+=i;
        }
        System.out.println(str);
    }

    public static void Sb(StringBuilder st){ // TIME COMPLEXITY= O(26) the stringbuilder is modified on every change in the string builder
        for(char i='a';i<='z';i++){
            st.append(i);
        }
        System.out.println(st);
    }
    public static void main(String[] args) {
        String str="aksha";
        StringBuilder st=new StringBuilder(str); // OR StringBuilder st=new StringBuilder("aksha") OR EVEN WE CAN LEAVE EMPTY("")
        NormalString(str);
        Sb(st);
    }
}
