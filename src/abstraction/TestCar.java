package abstraction;

public class TestCar
{
    public static void main(String[] args)
    {
        Car corolla = new Toyota();
        corolla.shape();                                //from interface
        corolla.start();                                //from interface

        Toyota lexus = new Toyota();
        lexus.start();
        lexus.energy();

        MotorCar model3 = new Toyota();
        model3.hybridEngine();                          //from abstract class

        Bus bus = new Toyota();
        bus.bigSizeMotorCar();
    }
}
