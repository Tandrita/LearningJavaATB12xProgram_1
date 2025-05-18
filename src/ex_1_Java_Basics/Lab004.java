package ex_1_Java_Basics;

public class Lab004 {
    public static void main(String[] args) {
        System.out.println(10/0);// Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(0/10); // This line will not run as first line has exception
        // Output of this line will come as 0 is it is executed at first.

    }
}
