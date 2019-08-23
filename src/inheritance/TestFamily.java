package inheritance;

public class TestFamily
{
    public static void main(String[] args)
    {
        Parents father = new Parents();
        father.height();
        father.skinColor();

        Children child1 = new Children();
        child1.education();
        child1.skinColor();
    }
}
