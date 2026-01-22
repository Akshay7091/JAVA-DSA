package Arrays.Strings;

public class LargestString {
    public static void main(String[] args) {
        String str[]={"apple","mango","banana"};
        String largest=str[0];
        for(int i=1;i<= str.length-1;i++){
            if(largest.compareTo(str[i])<0){  // The largest.compareTo(str[i] gives -ve value
                                             // when the first letter of str[i] is greater than first letter of largest assumed string
                largest=str[i];
            }
        }
        System.out.print(largest);
    }
}
