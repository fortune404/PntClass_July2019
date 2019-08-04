package othersMentoring;

import java.time.Year;
import java.util.Scanner;

public class Practice1
{
    public static void main(String[] args)
    {
        // Collection in Java:
        // Interfaces: Set, List Queue, Dqueue
        // Classes: ArrayList, vector linkedList, hasset, tree set, priority que


        //primitive data types:

        //int =
        //double =
        //char =
        //boolean =

//        for (int i =0; i <10; i++)
//        {
//            System.out.println(i);
//        }
//                                        //nested for loop
//        for (int j = 0; j<=3; j++)
//        {
//            System.out.println(j);
//        }

        for (int j = 0; j<=10; j++)
        {
            if(j==3)
            {
                continue;
            }
        }


        int day = 1;
                                                            //switchCase
        switch(day)
        {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tueday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            default: System.out.println("Invalid day");
        }


        // use of Year Class in java language

        Practice1 demoClass = new Practice1();

        demoClass.getAge(1996);


        demoClass.getLifeInfo();

    }

    // use of Year Class in java language
    int age = 0;
    public  int getAge(int birthYear)
    {
        age = Year.now().getValue() - birthYear;
        System.out.println("My age is "+ age);
        return age;


    }

    public void getLifeInfo()
    {
        Scanner demo2 = new Scanner(System.in);
        String lifeInfo = demo2.nextLine();
        System.out.println(lifeInfo);
    }
}
