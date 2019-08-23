package inheritance;

public class NewYorkCity
{
    public int numOfBoroughs = 5;
    public boolean parkingAvailable = false;
    public String subwaySystem = "MTA";
    private String nycFlagColors = "blue and orange";

    public void takeSubway()
    {
        System.out.println("Takes the subway");
    }

    public void payParkingFine()
    {
        System.out.println("Paid a fine of $65.00");
    }
}
