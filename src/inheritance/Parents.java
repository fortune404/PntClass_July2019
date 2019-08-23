package inheritance;

public class Parents extends GrandParents
{
    String familyName;
    public Parents()
    {

    }

    public Parents(String familyName)
    {
        this.familyName =familyName;
    }

    public void height()
    {
        System.out.println("Average heights");
    }

    public void sportsSkills()
    {
        System.out.println("They are athletic");
    }
}
