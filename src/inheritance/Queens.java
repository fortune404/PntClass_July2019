package inheritance;

public class Queens extends NewYorkCity
{
    String baseballStadium = "citiField stadium";
    String internationalAirport = "JFK";
    String domesticAirport = "LGA";

    public void payQueensTAx()
    {
        System.out.println("paid Queens Tax");
    }

    public void rideOnBus()
    {
        System.out.println("rides the Q25");
    }
}
