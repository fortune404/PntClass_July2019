package trycatch;

public class MainTry
{
    public static void main(String[] args)
    {
//        int num1  = 10;
//        int num2 = 0;
//
//        int answer =  num1/num2;
//
//        System.out.println(answer);
//        System.out.println("does something");

        try
        {
            int num1 = 10;
            int num2 = 0;
            System.out.println(num1/num2);
        }catch (ArithmeticException ex)
        {
            ex.printStackTrace();
            System.out.println("Number 2 is a zero, please enter a number greater than zero");
        }finally {
            System.out.println("does something");
        }
    }
}
