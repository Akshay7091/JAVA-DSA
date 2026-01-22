package BasicsofJAVA;

public class rough {
    public static void main(String[] args) {
        String s="fedcba";
        String rev="";
        int n=s.length(); //in cpp we use s.size() to get string size
        for(int i=n-1;i>=0;--i){ //in loops it doesnt matter if we use i++ or ++i and same in decrement also
            rev+=s.charAt(i); //in cpp we use s[i] to access the string element at i index

        }
        System.out.println(rev);
    }
}
