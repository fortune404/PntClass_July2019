package conditionalstatements;

public class IfElseStatements
{
    //Write a method that will determine if a number is ODD or EVEN?

    public static void checkIfNumberIsOddOrEven1(int num)           //static way
    {
        if (num%2 == 0)
        {
            System.out.println("The "+num+ " is even");
        }else
            {
                System.out.println("The "+ num+" is odd");
            }
    }


    public void checkIfNumberIsOddOrEven2(int num)                  //non-static way
    {
        if (num%2 == 0)
        {
            System.out.println("The "+num+ " is even");
        }else
        {
            System.out.println("The "+ num+" is odd");
        }
    }

    //Write a
    public static void compareBigAndSmallNumber1(int num1,int num2)      //static way
    {
        if (num1 > num2)
        {
            System.out.println(num1 + " is the biggest number");
            System.out.println(num2 + " is the smallest number");
        }else
            {
                System.out.println(num2 + " is the biggest number");
                System.out.println(num1 + " is the smallest number");
            }
    }

    public void compareBigAndSmallNumber2(int num1,int num2)      //static way
    {
        if (num1 > num2)
        {
            System.out.println(num1 + " is the biggest number");
            System.out.println(num2 + " is the smallest number");
        }else
        {
            System.out.println(num2 + " is the biggest number");
            System.out.println(num1 + " is the smallest number");
        }
    }

    public static void compareBigAndSmallNumber3(int num1,int num2)      //static way
    {
        if (num1 > num2)
        {
            System.out.println(num1 + " is the biggest number");
            System.out.println(num2 + " is the smallest number");
        }else if (num1 < num2)
        {
            System.out.println(num2 + " is the biggest number");
            System.out.println(num1 + " is the smallest number");
        }
    }


//----------------------------------------------------------------------------------
    public static void main(String[] args)
    {
        checkIfNumberIsOddOrEven1(5);
        System.out.println("------");
        IfElseStatements nonstatic1 = new IfElseStatements();
        nonstatic1.checkIfNumberIsOddOrEven2(97);

        compareBigAndSmallNumber1(20,80);
        System.out.println("------");
        IfElseStatements nonstatic2 = new IfElseStatements();
        nonstatic2.compareBigAndSmallNumber2(20,10);

        System.out.println("--------");

        compareBigAndSmallNumber3(22,233);
    }
}
