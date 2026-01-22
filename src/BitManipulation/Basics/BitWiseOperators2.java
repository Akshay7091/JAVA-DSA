package BitManipulation.Basics;

public class BitWiseOperators2 {
    public static void main(String[] args) {
        int a=5;

        //1. BitWise LeftShift Operator
        System.out.println(a<<2); //Moves all the numbers of the 5 binary number toward the left(00000101-->00010100) which is 20.
                                 //FOR COMPETITIVE PROGRAMMING REMEMBER a<<2 WILL BE EQUAL TO a*(2)^b --> 5*(2)^2 --> 5*4 --> 20.

        //2. BitWise RightShift Operator
        System.out.println(a>>2); //Moves all the numbers of the 5 binary number toward the right(00000101-->00000001) which is 1.
                                 //FOR COMPETITIVE PROGRAMMING REMEMBER a>>2 WILL BE EQUAL TO a/(2)^b --> 5/(2)^2 --> 5/4 --> 1.25 --> 1.
    }
}
