package statickeyword;

public class Land
{
    public static int landSize;                                 //to make static change the variable type to static

    public static void setLandSize(int landSize)                //to make static change the method type to static
    {
        Land.landSize = landSize;                               //to make static change THIS keyword to
    }                                                           //ClassName.landSize = landSize;

    public int getLandSize()
    {
        return landSize;
    }

    public static void shapeOfLand()
    {
        System.out.println("shape of the land is rectangle");
    }
}
