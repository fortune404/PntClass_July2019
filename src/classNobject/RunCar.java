package classNobject;

public class RunCar
{
    public static void main(String[] args)
    {
        Car corvette = new Car("Corvette","Stingray",2015);

        Car porsche = new Car("Porsche","Carerra 911",2019,90000.00,false);

        Car lamborghini = new Car("Lamborghini", "Avendator", 2019, 300000.00,false);

        String corvetteModel = corvette.getModel();
        System.out.println("The Corvette model is "+corvetteModel);

        corvette.setModel("z1");
        System.out.println(corvette.getModel());

        System.out.println("************");

        String porscheModel = porsche.getModel();
        System.out.println(porscheModel);

        int porscheYear = porsche.getYear();
        System.out.println("The porsche model year is "+porscheYear);


    }
}
