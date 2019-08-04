package conditionalstatements;

public class ForLoop
{
    public static void main(String[] args)
    {

        /*
        for (initialization; termination; increment)
        {
                for loop code goes here
        }
         */
        String name = "My name is Raihan";

        for (int n = 0; n < 5; n++)
        {
            System.out.println(name);
        }


            //int n = 0; 0 < 3; sout(name); n++  (n is now 1)

//--------------------------------------------------------------------------------------
        /* create a method that
        prints out all the even numbers from 500 to 100
        and will checks whether those numbers are odd or even
         */
    ForLoop.checkOddOrEven1();

    ForLoop.checkOddOrEven2(20,50);

    ForLoop.checkOddOrEven3(2,11);

    }

    public static void checkOddOrEven1()
    {
        for (int i = 500; i <= 1000; i++)
        {
            if (i %2 == 0)
            {
                System.out.println(i + " is even");
            }else
                {
                    System.out.println(i +" is odd");
                }
        }
    }


    public static void checkOddOrEven2(int start, int end)
    {
        for (int i = start; i <= end; i++)
        {
            if (i %2 == 0)
            {
                System.out.println(i + " is even");
            }else
            {
                System.out.println(i +" is odd");
            }
        }
    }


    public static void checkOddOrEven3(int start, int end)
    {
        if (start > end)
        {
            System.out.println("invalid parameters");
        }else
            {
                for (int i = start; i <= end; i++)
                {
                    if (i %2 == 0)
                    {
                        System.out.println(i + " is even");
                    }else
                    {
                        System.out.println(i +" is odd");
                    }
                }
            }

    }
}
