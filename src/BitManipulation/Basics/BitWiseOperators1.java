package BitManipulation.Basics;

public class BitWiseOperators1 {
    public static void main(String[] args) {
        int a=10,b=1;
        // 1. BitWise AND Operator
        System.out.println(a & b); // In here, The "&" Operator takes the Binary Form of the two numbers and performs Logic Gate's AND Operation
                                  //101 (5) and 110 (6) AND operation would be 100 (4).that's why o/p is 4
        //2. BitWise OR Operator
        System.out.println(a | b); //Just Like Logical AND Operation that is done with the help of "&" Operator, Logical OR Operation is done using
                                  // "|" This Operator
        //3. BitWise XOR Operator
        System.out.println(a ^ b); //"^" Performs Logical XOR Operation where 0,0/1,1 will give 0 and 1,0/0,1 will give 1 as o/p

        //4. BitWise NOT Operator
        System.out.print(~a); // when number 5 (in this case) gets stored in memory it is stored not only like 101 instead it stored as 00000101(32 bits)
                             //so when we perform not on this number the msb which is 0 in this case gets converted into 1
                            //along with all the other numbers and number becomes 1111...010. so ~5 gives 11111010(8 bits)
                           //but this "11111010" pattern is interpreted as -6 by the memory2

        // QUESTION-WHY "11111010" (1's compliment of 5 in 8 bit binary) IS INTERPRETED AS A -6 BY THE MEMORY?

        //ANSWER-->Computers need a way to represent both positive and negative numbers in binary.
        //The most efficient system for this is two’s complement
    }
}
