package loop;

import java.util.Scanner;

public class NestedForLoops
{
    public static void main(String[] args)
    {
    String msg = "hello world";


       // for (intialization; termination; counter)
      //  {

       // }

//        for (int i = 0; i < 5; i++)
//        {
//            System.out.println("Hello world");
//        }
//
//        for (int i = 1; i<= 10; i++)                                        //check odd or even
//        {
//            if (i%2 == 0 ) {
//                System.out.println(i+" is an even number");
//            }else {
//                System.out.println(i+ " is an odd number");
//            }
//        }


        int numOfRows = 5;
        for (int i = 1 ; i<= numOfRows ; i++)           //nested for loop
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //-----------------------------------------------

        for (int i = 1 ; i<= numOfRows ; i++)           //nested for loop
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int numOfRows2 = sc.nextInt();
        for (int i = 1 ; i<= numOfRows2 ; i++)           //nested for loop using scanner
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print('>');
            }
            System.out.println();
        }

    }
}
