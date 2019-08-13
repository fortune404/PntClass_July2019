package statickeyword;

public class TestLand
{
    public static void main(String[] args)
    {
        Land raihanLand = new Land();

        raihanLand.setLandSize(50);
        String namee = raihanLand.ownerName("Dione");           //non- static
        System.out.println(namee);


        Land.getLandSize(100);




        // System.out.println("raihan's land size is "+raihanLand.getLandSize());

//        Land pntLand = new Land();
//        pntLand.setLandSize(20);
//        System.out.println("pnt's land size is "+ pntLand.getLandSize());
//
//        System.out.println("raihan's land size is "+raihanLand.getLandSize());

        //----------------------------------------------------------------------------------------

//        Land.shapeOfLand();

    }
}
