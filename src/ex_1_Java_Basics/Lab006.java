package ex_1_Java_Basics;

public class Lab006 {
    public static void main(String[] args) {

        byte age = 30;// max value byte can store -128 to 127
        age = 29;
        System.out.println(age);
        //byte> data type > Type of container
        // age> variable name>identifier
        // 29 or 30 > Variable value> Literal

        int a = 30; // max value int take is -2^31 to 2^31-1
        a = 30/7; // it will not take decimal value, it will take output as 4
        a = a + 1;
        System.out.println(a);


        int _ = 2; // underscore can be used as variable name but cannot be used in print statement therefore it cannot be printed.
        int _2 = 4; // this can be printed.
        System.out.println(_2);
    }
}
