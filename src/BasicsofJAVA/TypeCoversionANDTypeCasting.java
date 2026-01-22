package BasicsofJAVA;

public class TypeCoversionANDTypeCasting {
    public static void main(String[] args) {
        // int a=5;
        //float b=a;
        //System.out.println(b); this is called type conversion where int
        // (which is shorter in size than float in size) is converted into float

        // float a=5.0f
        //int b=a;
        //System.out.println(b); this code will giver error as we are
        // converting the data type which is larger in size into small sized data type


        float a=5.0f;
        int b=(int) (a);
        System.out.println(b); // this is type casting in which we force fully
        // convert the data type which is larger in size into smaller sized
        // data type with the risk data loss


    }
}
