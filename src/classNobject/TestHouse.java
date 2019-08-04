package classNobject;

import welcome.Office;

public class TestHouse
{
    public static void main(String[] args)
    {
        House myHouse = new House();

        myHouse.classRoom();
        myHouse.adminRoom();

        Office myOffice1 = new Office();           /*THIS WAS IMPORTED FROM welcome PACKAGE. It can be imported
                                                   from different package but ->> import welcome.Office;
                                                   needs to be mentioned on top in order for this to work */
        myOffice1.officeRoom();

    }
}
