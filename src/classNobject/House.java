package classNobject;

public class House
{
    String address = "Cambridge, MA";
    String houseName = "Harvard University";

    public void classRoom()
    {
        System.out.println("Class room for computer science");
        System.out.println("We teach all the functions of programming in class room");
    }

    public void adminRoom()
    {
        System.out.println("Admin room for all the corporates");
    }

    public String getHouseName()
    {
        return houseName;
    }
}
