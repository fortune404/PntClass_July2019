package abstraction;

public class Iphone extends SmartPhone implements Phone
{

    @Override
    public void shape()
    {
        System.out.println("The phone should be 6.87 inch tall and 5.87 inch width");
    }

    @Override
    public void speaker()
    {
        System.out.println("The phone should have a dual speakers");
    }

    @Override
    public void powerOn()
    {
        System.out.println("Should turn on by holding the sleep button when it's off");
    }

    @Override
    public void powerOff()
    {
        System.out.println("Should turn off anytime by holding the sleep button when it's on");
    }

    public void color()
    {
        System.out.println("The color should be space gray");
    }

    @Override                                                   //from smartPhone
    public void display()
    {
        System.out.println("High resolution optimized display");
    }

    @Override                                                   //from smartPhone
    public void bluetooth()
    {
        System.out.println("Able to transfer files with bluetooth");
    }

    public void chargable()
    {
        System.out.println("Yes, the battery is chargeable");
    }
}
