package polymorphism;

public class TestLandCalculator
{
    public static void main(String[] args)
    {
        LandCalculator cal = new LandCalculator();

        int resultOfLine = cal.areaOfLand(1,3);
        System.out.println(resultOfLine);

        ModernLandCalculator mCal = new ModernLandCalculator();
        int resultOfModernCalculator = mCal.areaOfLand(1200,33,23);
        System.out.println(resultOfModernCalculator);

    }
}
