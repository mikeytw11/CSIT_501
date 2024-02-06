//---------------------------------------------------------------------
// Represents inventory of cars
//---------------------------------------------------------------------

import java.text.NumberFormat;
 public class DealershipInventory
 {
     public Car[] inventory;
     private static int count;
     String report;
     //---------------------------------------------------------------------
     // Creates an initially empty car inventory
     //---------------------------------------------------------------------
     public DealershipInventory()
     {
         inventory = new Car[10];
         count = 0;
     }
     //---------------------------------------------------------------------
     // Adds a car to the inventory, increasing the size of the inventory
     // array if necessary.
     //---------------------------------------------------------------------
     public void addCar(String make, String model, String vin, String record, int year,
                        int mileage, double cost, String image1)
     {
         if (count == inventory.length)
             increaseSize();

         inventory[count] = new Car(make, model, vin, record, year, mileage, cost, image1);
         count++;
     }
     //---------------------------------------------------------------------
     // Returns a report describing the inventory.
     //---------------------------------------------------------------------
     public String toString()
     {
         NumberFormat fmt = NumberFormat.getCurrencyInstance();

         String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
         report += "Car Inventory\n\n";

         report += "Number of Cars: " + count + "\n";
         report += "\n\nCar List:\n\n";

         for (int Car = 0; Car < count; Car++)
             report += inventory[Car].toString() + "\n";

         return report;
     }

     //---------------------------------------------------------------------
     // Increases the capacity of the collection
     //---------------------------------------------------------------------
     private void increaseSize()
     {
         Car[] temp = new Car[inventory.length * 2];

         for (int Car = 0; Car < inventory.length; Car++)
             temp[Car] = inventory[Car];

         inventory = temp;
     }
 }
