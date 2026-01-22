package Arrays.Strings;

public class Anagrams {

    public static boolean Anagram(String str1,String str2){
        int freq[]=new int[26];
        for(int i=0;i<str1.length();i++){
            freq[(int)str1.charAt(i)-'a']++;
            freq[(int)str2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="race",str2="care";
        System.out.print(Anagram(str1,str2));
    }
}
