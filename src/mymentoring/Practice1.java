package mymentoring;

public class Practice1
{
    public static void main(String[] args)
    {
            // DATA TYPES
        /*
            Primitive data types: byte, short, int, long, float, double, boolean, char.
            -Integer types: byte, short, int, long
            -Floating point types: float, double
            -boolean type = boolean
            -character type: char

            Non-primitive data types: String, classes, interface, arrays, enum etc
         */

//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);

        byte num1 = 12;
        short num2 = 20000;
        int num3 = 100;
        long num4 = 237775433;
        float num5 = 40.25f;
        double num6 = 20.30;
        boolean isTrue = num1 == num2;
        char character = '$';

//        // unicode:
//        char unicode = '\u2615';
//
//        char uni2 = '\u0377';
//
//        String name = "Jackie";


//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(isTrue);
//        System.out.println(character);
//        System.out.println(name);
//        System.out.println(unicode);
//        System.out.println(uni2);

                //operators
        //Arithmetic operators

        int add = num1 + num2;
        int subtract = 10 - 8;
        double multiply = 9 * 10;
        int divide = 30 / 2;
        int modulus = 20 % 3;
        int increment = 20;
        increment++;
        //System.out.println(increment);
        int decrement = 30;

        --decrement;
        //System.out.println(decrement);

        //Assignment operators

        int x = 10;
        x %= 3;
        //System.out.println(x);


        //Comparison Operators
        boolean equalTo = 20 == 20;
        boolean notEqual = 30 != 30;
        boolean lessThan = 20 < 100;
        boolean greaterThan = 50 > 25;
        boolean lessThanOrEqual = 75 <= 75;
        boolean greaterThanOrEqual = 100 >= 50;

//        System.out.println(equalTo);
//        System.out.println(notEqual);
//        System.out.println(lessThan);
//        System.out.println(greaterThan);
//        System.out.println(lessThanOrEqual);
//        System.out.println(greaterThanOrEqual);

        //Logical Operators

        /*
        TT = T
        FT = F
        TF = F
        FF = F
         */

//        System.out.println(20 > 15 && 30 < 20);         //logical and
//        System.out.println(20 > 150 || 3 > 20);         //logical or
//        System.out.println(!(20 < 15 && 30 > 20));      //logical not

        //concatenate
        String msg = "Johnny Depp";
        System.out.println("Name:"+msg);
        System.out.println(msg.length());




























    }
}
