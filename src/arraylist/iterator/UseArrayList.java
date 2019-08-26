package arraylist.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("NY");
        list.add("AZ");
        list.add("FL");
        list.add("NJ");

//        for (int i = 0; i < list.size(); i++)
//        {
//            System.out.println(list.get(i));
//        }



        Iterator it = list.iterator();
                                                                            //Use of Iterator
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

//
//        for (String st: list)                                              // Using for each loop
//        {
//            System.out.println(st);
//        }

    }
}
