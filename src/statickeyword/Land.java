package statickeyword;

public class Land
{
    public int landSize;                                 //to make static change the variable type to static

    public void setLandSize(int landSize)                //to make static change the method type to static
    {
        this.landSize = landSize;                               //to make static change THIS keyword to
        System.out.println(landSize);
    }                                                           //ClassName.landSize = landSize;


    public static int landSize2;                                 //to make static change the variable type to static

    public static void getLandSize(int landSize2)                //to make static change the method type to static
    {
        Land.landSize2 = landSize2;                               //to make static change THIS keyword to
        System.out.println(landSize2);
    }

    public String ownerName(String name)
    {
        return name;
    }
//
//    public int getLandSize()
//    {
//        return landSize;
//    }
//
//    public static void shapeOfLand()
//    {
//        System.out.println("shape of the land is rectangle");
//    }
}
