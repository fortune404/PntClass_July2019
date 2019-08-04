package statickeyword;

public class TestDriveWay
{
    public static void main(String[] args) {


        DriveWay tashfiaDriveway = new DriveWay();
        tashfiaDriveway.setDriveWaySize(10);
        System.out.println("Tashfia's driveway size: "+tashfiaDriveway.getDriveWaySize());

        DriveWay dionDriveway = new DriveWay();
        dionDriveway.setDriveWaySize(12);
        System.out.println("dione's driveway size: "+ dionDriveway.getDriveWaySize());

        System.out.println("Tashfia's driveway size: "+tashfiaDriveway.getDriveWaySize());
        //--------------------------------------------------------------------------------------

        DriveWay.shapeOfDriveWay();


        //static variable
//        Tashfia's driveway size: 10
//        dione's driveway size: 12
//        Tashfia's driveway size: 12

    }
}
