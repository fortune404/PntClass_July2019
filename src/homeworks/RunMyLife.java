package homeworks;

public class RunMyLife
{
    public static void main(String[] args)
    {
        MyLife human = new MyLife();

        human.speak("Mohammed Raihan Kabir",3997,"PHOENIX, AZ",
                     "computer information systems","rk816.rahi@gmail.com");

        human.eat("Cheese burger");

        int doMath = human.math(2,4,"addition");
        System.out.println(doMath);

        String activities = human.activity("Raihan");
        System.out.println(activities);

        human.sleep();
    }
}
