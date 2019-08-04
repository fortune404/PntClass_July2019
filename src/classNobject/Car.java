package classNobject;

public class Car
{
    String brand = null;
    String model = null;
    int year = 0;
    double basePrice = 0;
    boolean isUsed = true;


    public Car()
    {
        this.brand = "Mercedes";
        this.model = "E300";
        this.year = 2018;
        this.basePrice = 65000.00d;
        this.isUsed = false;
    }

    public Car(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model,int year, double basePrice, boolean isUsed)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
        this.isUsed = isUsed;
    }


    public String getBrand()                                //getter
    {
        return this.brand;
    }

    public void setBrand(String brand)                      //setter
    {
        this.brand = brand;
    }

    public String getModel()                                //getter
    {
        return model;
    }

    public void setModel(String model)                      //setter
    {
        this.model = model;
    }

    public int getYear()                                    //getter
    {
        return year;
    }

    public void setYear(int year)                           //setter
    {
        this.year = year;
    }

    public double getBasePrice()                            //getter
    {
        return basePrice;
    }

    public void setBasePrice(double basePrice)              //setter
    {
        this.basePrice = basePrice;
    }

    public boolean isUsed()                                 //getter
    {
        return isUsed;
    }

    public void setUsed(boolean used)                      //setter
    {
        isUsed = used;
    }
}
