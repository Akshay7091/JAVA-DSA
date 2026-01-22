package HashMaps.HMaps;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean isValid(String st1,String st2){
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<st1.length();i++){
            freq.put(st1.charAt(i), freq.getOrDefault(st1.charAt(i),0)+1);
        }

        for(int i=0;i<st2.length();i++){
            if(freq.containsKey(st2.charAt(i))){
                freq.put(st2.charAt(i),freq.get(st2.charAt(i))-1);
            }
            else{
                return false;
            }

            if (freq.get(st2.charAt(i)) == 0) {
                freq.remove(st2.charAt(i));
            }
        }
        return freq.isEmpty();
    }
    public static void main(String[] args) {
        String st1="ab",st2="ba";
        System.out.print(isValid(st1,st2));
    }
}
