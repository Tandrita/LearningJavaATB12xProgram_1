package ex_1_Java_Basics;

public class Lab007 {
    public static void main(String[] args) {
        byte age = 10;
        // how byte age is stored in memory?
        //Ans> Memory can only store 0 and 1
        /* 1.When the statement byte b = 10 is executed in Java.

          2.The JVM creates a variable named b of type byte and assigns it the value 10.

          3.The value 10 is represented in binary format as 00001010.

          4.The JVM allocates a specific memory location for the variable b. */
        System.out.printf("Your output is %d",age);
        //%d for int, byte, long, short > data type
        // %s for String
        // %f for float, double
        // %b for boolean

    }
}
