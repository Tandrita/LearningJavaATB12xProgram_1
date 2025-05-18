package ex_2_Java_Literals;

public class Lab010 {
    public static void main(String[] args) {
        int a = 10;
        //Literal type> integral
        final float PI= 3.14f;
        //Literal type> float
        int binary_num = 0b1010; // for binary data store, first add 0b in the variable value and then the number without space
        // Literal Type> Binary literal

        // Octal base? -> 8
        int octal = 0101;

        // Hexadecimal Literals – 16
        int hex = 0Xface;
        // base 16 color combination are in hex – #28a745

        char c1 = 'A';  // A to Z, a-z, !@#$%^&*()_+
       // char c = "A"; // "" == String = Bunch of Char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' ';  // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("TandritaDewanjee");
        System.out.println("Tandrita"+new_line+"Dewanjee");
        System.out.println("Tandrita\nDewanjee");
        System.out.println("Tandrita"+tab_line+"Dewanjee");
        System.out.println("Tandrita"+back_space+"Dewanjee");
        System.out.println( " ----- ");

        System.out.println("Tandrita is "+carriage_return+"Dewanjee");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");


        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60'; // unicode character
    }

}
