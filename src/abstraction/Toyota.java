package abstraction;

public class Toyota extends MotorCar implements Car
{

    @Override
    public void shape() {
        System.out.println("Car shape must be smaller than 6 feet");
    }

    @Override
    public void start() {
        System.out.println("Car must have start method to start the engine");
    }

    @Override
    public void stop() {
        System.out.println("Car must have break system to stop the car");
    }

    public void energy()
    {
        System.out.println("Car run by oil");
    }

    @Override
    public void hybridEngine() {
        System.out.println("Car consumes less fuel");
    }
}
