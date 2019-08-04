package structure;

public class TestCalculator
{
    public static void main(String[] args)
    {
        Calculator demoCal = new Calculator();

        int result = demoCal.addition(2,10);
        System.out.println(result);

        demoCal.subtraction(2,6);

        demoCal.multiplication(5,2,8);
    }
}
