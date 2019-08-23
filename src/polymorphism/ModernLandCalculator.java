package polymorphism;

public class ModernLandCalculator extends LandCalculator
{
    public int areaOfLand(int a, int b, int c)
    {
        int total = a - b + c - 1;
        return total;
    }
}
