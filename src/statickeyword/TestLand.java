package statickeyword;

public class TestLand
{
    public static void main(String[] args)
    {
        Land raihanLand = new Land();
        raihanLand.setLandSize(15);
        System.out.println("raihan's land size is "+raihanLand.getLandSize());

        Land pntLand = new Land();
        pntLand.setLandSize(20);
        System.out.println("pnt's land size is "+ pntLand.getLandSize());

        System.out.println("raihan's land size is "+raihanLand.getLandSize());

        //----------------------------------------------------------------------------------------

        Land.shapeOfLand();

    }
}
