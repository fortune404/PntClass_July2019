package constructor;

public class House
{
    String houseName;

    public House()
    {

    }


    public House(String houseName)
    {
        this.houseName = houseName;
        System.out.println(houseName);
    }

    public void houseName()
    {
        System.out.println("white house");
    }
}
