package problemSolving;

public class FibonacciNumbers
{
    public static void main(String[] args)
    {
        int prev = 0;
        int next = 1;

        for (int i = 0; i < 13; i++)
        {
            System.out.print(prev+" ");
            prev = prev + next;
            next = prev - next;

        }
    }
}
