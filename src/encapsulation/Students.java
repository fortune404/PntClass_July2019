package encapsulation;

public class Students
{
    private String stName;

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getStID() {
        return stID;
    }

    public void setStID(int stID) {
        this.stID = stID;
    }

    public String getStDOB() {
        return stDOB;
    }

    public void setStDOB(String stDOB) {
        this.stDOB = stDOB;
    }

    private int stID;
    private String stDOB;

    public Students()
    {

    }

    public Students(String stName, int stID, String stDOB)
    {
        this.stName = stName;
        this.stID = stID;
        this.stDOB = stDOB;
    }
}
