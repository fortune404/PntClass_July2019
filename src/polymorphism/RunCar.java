package polymorphism;

public class RunCar
{
    public static void main(String[] args)
    {
        OverRideCar car1 = new OverRideCar();

        car1.engine("This a Corvette", "This car have a V8 engine");
        car1.engine("This is a Lycan Hypersport", "This car have a v12 engine. One of the rare and fast car in the world" );
    }
}
