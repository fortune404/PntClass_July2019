package statickeyword;

public class DriveWay
{
    public static int driveWaySize;

    public void setDriveWaySize(int driveWaySize)           //non-static
    {
        this.driveWaySize = driveWaySize;
    }

    public int getDriveWaySize()
    {
        return driveWaySize;
    }

    public static void shapeOfDriveWay()                    //static
    {
        System.out.println("Shape of drive way is rectangular");
    }
}
