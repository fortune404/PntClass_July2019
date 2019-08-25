package keywords;

public class Computers
{
    int ramSize;
    static final int cpu = 3;

    public Computers(){}
    public Computers(int ramSize)
    {
        this.ramSize = ramSize;
    }

    public void assembleComputer()
    {
        System.out.println("Computer was assembled in USA");
    }

    public void assembleMonitor()
    {
        System.out.println("Computer monitors is Retina screen");
    }

}
