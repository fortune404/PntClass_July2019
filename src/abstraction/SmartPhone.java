package abstraction;

public abstract class SmartPhone
{
    public abstract void display();
    public abstract void bluetooth();
    public void videoChat()
    {
        System.out.println("Able to video chat with HD camera");
    }
}
