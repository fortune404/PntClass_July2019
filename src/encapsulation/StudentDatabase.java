package encapsulation;

public class StudentDatabase
{
    public static void main(String[] args)
    {
        Students st1 = new Students();
        st1.setStName("Raihan");
        st1.setStID(101);
        st1.setStDOB("12/17/1980");
        System.out.println(st1.getStName()+ " "+ st1.getStID()+ " "+ st1.getStDOB());




        Students st2 = new Students();
        st2.setStName("Kabir");
        st2.setStID(102);
        st2.setStDOB("12/17/2019");
        System.out.println(st2.getStName()+ " "+ st2.getStID()+ " "+ st2.getStDOB());
    }
}
