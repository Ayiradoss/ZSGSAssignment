/*1. We want to store the information about different vehicles. Create a class named Vehicle
 with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and
 fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air,
 liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership
cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and 
a TVS bike. */
class Vehicles{
       int mileage;
       int price;
}
  class Car extends Vehicles{
        int cost;
        int warranty;
        int seatingCapacity;
        String fuelType;
    }
    class Audi extends Car{
          String modelType;
     void displayInfo(){
      System.out.println("Audi Car info----");
        System.out.println("Cost: "+cost);
        System.out.println("Warranty: "+ warranty);
        System.out.println("SeatingCapacity: "+seatingCapacity);
        System.out.println("Fuel Type: "+fuelType);
        System.out.println("Model Type : "+ modelType);  
        System.out.println("Mileage: "+ mileage);
        System.out.println("Price: "+ price);      
    }
    class Ford extends Car{
      String modelType;
  
    void displayInfo(){
      System.out.println("Ford Car info----");
      System.out.println("Cost: "+ cost);
      System.out.println("Warranty: "+warranty);
      System.out.println("SeatingCapacity: "+seatingCapacity);
      System.out.println("Fuel Type: "+fuelType);
      System.out.println("Model Type : "+ modelType); 
      System.out.println("Mileage: "+ mileage);
      System.out.println("Price: "+ price);
    }
  }
    class Bike extends Vehicles{
      int noOfCylinders;
      int onOfGears;
      String coolingType;
      String wheelType;
      int fuelTankSize;
    }
    class Bajaj extends Bike{
      String modelType;
    }
    void displayInfo(){
      System.out.println("Bajaj Bike info----");
      System.out.println("Number of cylinders: "+ noOfCylinders);
      System.out.println("Number of gears: "+noOfGears);
      System.out.println("Cooling Type: "+coolingType);
      System.out.println("Wheel Type: "+wheelType);
      System.out.println("Fuel Tank Size: "+ fuelTankSize); 
      System.out.println("Mileage: "+ mileage);
      System.out.println("Price: "+ price);
    }
    class Tvs extends Bike{
      String modelType;
    }
    void displayInfo(){
      System.out.println("Tvs Bike info----");
      System.out.println("Number of cylinders: "+ noOfCylinders);
      System.out.println("Number of gears: "+noOfGears);
      System.out.println("Cooling Type: "+coolingType);
      System.out.println("Wheel Type: "+wheelType);
      System.out.println("Fuel Tank Size: "+ fuelTankSize); 
      System.out.println("Mileage: "+ mileage);
      System.out.println("Price: "+ price);
    }
  }
  
      public static void main(String[] args) {
        
      }    
}
