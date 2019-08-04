package day1_afterClass;

public class DemoCat
{
    public static void main(String[] args)
    {
        int x = 5;
        System.out.println(x);

        Cat kabirsCat = new Cat();

        Cat kabirsCat1 = new Cat(21,10.22,"persian",true);

        System.out.println(kabirsCat.age);
        System.out.println(kabirsCat.weight);
        System.out.println("kabir's cat type is "+ kabirsCat.type);
        kabirsCat.purrs();
        System.out.println(kabirsCat.canGiveBirth(kabirsCat.isFemale));
    }
}
