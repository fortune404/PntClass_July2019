package day1_afterClass;

public class Cat
{
    int age = 5;
    double weight = 5.52;
    String  type = "Persian";
    boolean isFemale = true;


    public Cat()
    {

    }

    public Cat(int age, double weight, String type,boolean isFemale)
    {
        this.age = age;
        this.weight = weight;
        this.type = type;
        this.isFemale = isFemale;
    }

    public void purrs()
    {
        System.out.println("purrrrrr");

    }

    public boolean canGiveBirth(boolean isFemale)
    {
        if (isFemale == true)
        {
            return true;
        }else
            {
                return false;
            }
    }



    // int = age
    // double = weight
    // String = type
    // boolean = isFemale

}
