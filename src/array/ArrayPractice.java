package array;

import java.util.Scanner;

public class ArrayPractice
{
    public static void main(String[] args)
    {
//        Scanner scan = new Scanner(System.in);
//
//        int[] employeeId = new int[4];
//        System.out.println("enter the id");
//        for (int i = 0; i < employeeId.length; i++)
//        {
//            employeeId[i] = scan.nextInt();
//        }
//
//        for (int i = 0; i < employeeId.length; i++)
//        {
//            System.out.println(employeeId[i]);
//        }


        Scanner scan2 = new Scanner(System.in);

        String[] names = new String[3];

        for (int i =0; i < names.length; i++)
        {
            names[i] = scan2.nextLine();
        }

        for (int i = 0; i< names.length; i++)
        {
            System.out.println(names[i]);
        }














    }
}
