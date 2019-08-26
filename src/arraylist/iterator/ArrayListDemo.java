package arraylist.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList <String> arrayList = new ArrayList<>();

        arrayList.add("Jakie");
        arrayList.add("Joe");
        arrayList.add("Bobby");

        System.out.println("The size of array is currently: "+arrayList.size());


        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        //arrayList.remove(arrayList.indexOf("Joe"));              //to remove
        //--------------------------------------------------------------------------



        // create an array list that contains 100 random integers
        //1. create an array list
        //2. store data into that array list
        //3. **Bonus *** print the array list

        try
        {
            ArrayList <Integer> numbers = new ArrayList<>();
        Random rand = new Random();
            //this for loop is assigning random integer values to the array
            for (int i = 0; i < 100; i++)
            {
                numbers.add(rand.nextInt());
            }
            System.out.println("\nFor Loop");
            // printing out all the random numbers from the array list, from 0-100
            for (int i= 0; i < 100; i++)
            {
                System.out.println(numbers.get(i));
            }
            System.out.println("\nFor each loop");
            for (Integer num: numbers)
            {
                System.out.println(num);
            }

            System.out.println("\nWhile loop");
            Iterator iterator = numbers.iterator();
            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }


//        ArrayList <Integer> numbers = new ArrayList<>();
//        Random rand = new Random();
//
//        //this for loop is assigning random integer values to the array
//        for (int i = 0; i < 100; i++)
//        {
//            numbers.add(rand.nextInt(i));
//        }
//
//        // printing out all the random numbers from the array list
//        for (int i= 0; i < 100; i++)
//        {
//            System.out.println(numbers.get(i));
//        }






    }
}
