import java.text.NumberFormat;

public class Car
{
    private String make, model, vin, record, image1;
    private int year, mileage;
    private double cost;

    //---------------------------------------------------------------------
    // Create a new Car with specified information above.
    //---------------------------------------------------------------------
    public Car(String make, String model, String vin, String record, int year, int mileage, double cost, String image1)
    {
        this.make = make;
        this.model = model;
        this.vin = vin;
        this.record = record;
        this.year = year;
        this.mileage = mileage;
        this.cost = cost;
        this.image1 = image1;
    }
    //---------------------------------------------------------------------
    // Returns a string description of Car.
    //---------------------------------------------------------------------
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String description;

        //description = fmt.format(year) + "\t" + make + "\t";
        //description += vin + "\t" + mileage + "\t" + model + "\t" + cost + "\t" + record;

        description = year + "\t" + make + "\t" + model + "\t";
        description += vin + "\t" + mileage + "\t" +  fmt.format(cost) + "\t" + record + "\t" + image1;

        return description;
    }
}