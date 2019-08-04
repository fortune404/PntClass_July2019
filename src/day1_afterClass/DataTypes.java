package day1_afterClass;

public class DataTypes
{
    public static void main(String[] args)
    {
        /*
        byte    (8 bits)    -128 to 127
        short   (16 bits)   -32,768 to 32,767
        int     (32 bits)   -2,147,483,648 to 2,147,483,647
        long    (64 bits)   -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float
        double
        char
        boolean
         */

        int myMaxValue1 = Integer.MAX_VALUE;
        int myMinValue2 = Integer.MIN_VALUE - 1;

        int myMinValue1 = Integer.MIN_VALUE;
        int myMaxValue2 = Integer.MAX_VALUE + 1;

        System.out.println(myMaxValue2);
        System.out.println(myMinValue1);
        System.out.println(myMaxValue1);
        System.out.println(myMinValue2);


        float myFloatNum1 = 10.00f;
        System.out.println(myFloatNum1);

        char myChar1 = '&';
        char myChar2 = '\u2615';
        System.out.println(myChar1);

        System.out.println(myChar2);

        boolean isFoodAvailableAtHome = false;
        boolean isOverEighteen = true;

        String myName = "Raihan";
        System.out.println(myName);
        myName = "Raihan Kabir";
        System.out.println(myName);

        String stringNum = "100";
        System.out.println(stringNum);
        System.out.println(stringNum + 75);

        String studentName = "John doe";
        System.out.println(studentName.charAt(0));
        System.out.println(studentName.toLowerCase());
        System.out.println(studentName.toUpperCase());
        System.out.println(studentName.indexOf('h'));



    }

}
