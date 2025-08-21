/* 1. We want to store the information about different vehicles. Create a class named Vehicle
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
import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;
class Vehicles{
       int mileage;
       int price;
}
  class Car extends Vehicles{
        int ownershipCost;
        int warranty;
        int seatingCapacity;
        String fuelType;
    }
    class Audi extends Car{
          String modelType;
     void displayInfo(){
      System.out.println("Audi Car info----");
        System.out.println("OwnershipCost: "+ownershipCost);
        System.out.println("Warranty: "+ warranty+" years");
        System.out.println("SeatingCapacity: "+seatingCapacity);
        System.out.println("Fuel Type: "+fuelType);
        System.out.println("Model Type : "+ modelType);  
        System.out.println("Mileage: "+ mileage);
        System.out.println("Price: "+ price);     
        System.out.println("--------------------"); 
    }
  }
    class Ford extends Car{
      String modelType;
  
    void displayInfo(){
      System.out.println("Ford Car info----");
      System.out.println("OwnershipCost: "+ownershipCost);
      System.out.println("Warranty: "+warranty+" years");
      System.out.println("SeatingCapacity: "+seatingCapacity);
      System.out.println("Fuel Type: "+fuelType);
      System.out.println("Model Type : "+ modelType); 
      System.out.println("Mileage: "+ mileage);
      System.out.println("Price: "+ price);
      System.out.println("-----------------------");
    }
  }
    class Bike extends Vehicles{
      int noOfCylinders;
      int noOfGears;
      String coolingType;
      String wheelType;
      int fuelTankSize;
    }
    class Bajaj extends Bike{
      String modelType;
    
    void displayInfo(){
      System.out.println("Bajaj Bike info----");
      System.out.println("Number of cylinders: "+ noOfCylinders);
      System.out.println("Number of gears: "+noOfGears);
      System.out.println("Cooling Type: "+coolingType);
      System.out.println("Wheel Type: "+wheelType);
      System.out.println("Fuel Tank Size: "+ fuelTankSize); 
      System.out.println("Mileage: "+ mileage);
      System.out.println("Price: "+ price);
      System.out.println("------------------------");
    }
  }
    class Tvs extends Bike{
      String modelType;
    
    void displayInfo(){
      System.out.println("Tvs Bike info----");
      System.out.println("Number of cylinders: "+ noOfCylinders);
      System.out.println("Number of gears: "+noOfGears);
      System.out.println("Cooling Type: "+coolingType);
      System.out.println("Wheel Type: "+wheelType);
      System.out.println("Fuel Tank Size: "+ fuelTankSize); 
      System.out.println("Mileage: "+ mileage);
      System.out.println("Price: "+ price);
      System.out.println("-------------------------");
    }
  }
  public class Day4{
      public static void main(String[] args) {
        
         Audi audi = new Audi();
         audi.ownershipCost = 20000;
         audi.warranty = 5;
         audi.seatingCapacity= 6;
         audi.fuelType = "Full";
         audi.modelType = "2018 model";
         audi.mileage = 12;
         audi.price = 500000;
         audi.displayInfo();

         Ford ford = new Ford();
         ford.ownershipCost = 20000;
         ford.warranty = 5;
         ford.seatingCapacity= 6;
         ford.fuelType = "Full";
         ford.modelType = "2018 model";
         ford.mileage = 12;
         ford.price = 500000;
         ford.displayInfo();

         Bajaj baj = new Bajaj();
         baj.noOfCylinders= 1;
         baj.noOfGears = 4;
         baj.coolingType = "None";
         baj.wheelType = "Normal";
         baj.fuelTankSize = 5;
         baj.mileage = 50;
         baj.price = 90000;
         baj.displayInfo();

         Tvs tvs = new Tvs();
         tvs.noOfCylinders= 1;
         tvs.noOfGears = 4;
         tvs.coolingType = "None";
         tvs.wheelType = "Normal";
         tvs.fuelTankSize = 5;
         tvs.mileage = 50;
         tvs.price = 90000;
         tvs.displayInfo();  
    }
  }

/*2. Construct a base class called twoD contains x and y and methods to read and write the 
x and y. Create another class called threeD which is derived from twoD and also contains
z and write methods to read and write z. Also write a method to find the distance of two
threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two
arguments" */

class TwoD{
  private double x;
  private double y;
    TwoD(){
       System.out.println("This is Default constructor");
    }
    TwoD(double x, double y){
       System.out.println("Parameterized Constructor");
       this.x=x;
       this.y=y;
    }
    public void setX(double x){
      this.x=x;
    }
    public void setY(double y){
      this.y =y;
    }
    public double getX(){
      return x;
    }
    public double getY(){
      return y;
    }
}
class ThreeD extends TwoD{
  private double z;
  ThreeD(){
    super();
  }
  ThreeD(double x,double y,double z){
    super(x, y);
    this.z = z;
  }
  public void setZ(double z){
    this.z= z;
  }
  public double getZ(){
    return z;
  }
  public void setDistance(double x, double y, double z){
    setX(x);
    setY(y);
    this.z= z;
  }
   public double getDistance(ThreeD t) {
        return Math.sqrt(
            Math.pow(getX() - t.getX(), 2) +
            Math.pow(getY() - t.getY(), 2) +
            Math.pow(getZ() - t.getZ(), 2));
  }
  void display(){
    System.out.print(" X = "+getX()+" Y = "+getY()+" Z = "+getZ());
    }
}
class Qus2{
  public static void main(String[] args) {
    ThreeD obj = new ThreeD();
    obj.setDistance(3,2,4);
    obj.display();
    obj.setDistance(3,2,4);
  }
}

/*3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file.
Then, declare a class called Circle that is derived from the class Point. The class Circle has
public member functions Circle (constructor), setRadius(), getRadius() and area() and one 
private data member radius. The class Circle indirectly uses private member x and y of class
Point to store the coordinate of the center of the circle. The class Circle also checks to 
make sure the radius value is a positive number, otherwise it is set to default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using
public methods of class point.Implement the class Circle and write a driver program to test the
class Circle. An example of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14 */

class Point{
    private int x;
    private int y;
  
public Point(){
    x=0;
    y=0;
  }
  public void setPoint(int x, int y){
    this.x =x;
    this.y=y;
  }
  int getX(){
    return x;
  }
  int getY(){
    return y;
  }
  void printPoint(){
  System.out.println("("+x+","+y+")");
  }
}

class Circle extends Point{
    private double r;
  public Circle(){
    r=1;
  }
   public void setRadius(double r){
    if(r>0){
      this.r= r;
    }
    else{
      this.r=1;
    }
   }
   public double getRadius(){
    return r;
   }
  public double area(){
     return Math.PI*r*r;
  }
}
class Main{
public static void main(String args[]){
      Circle cir = new Circle();
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter x : ");
      int x = sc.nextInt();
      System.out.print("Enter y : ");
      int y = sc.nextInt();
      System.out.print("Enter radius : ");
      int r = sc.nextInt();
      cir.setPoint(x, y);
      cir.setRadius(r);
      System.out.print("Enter circle center: ");
      cir.printPoint();
      System.out.println();
      System.out.println("Radius : "+cir.getRadius());
      System.out.println("Area : "+cir.area());
    }
  }

  //4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.

 /*  class A{
    void display(){
      System.out.print("Class A");
    }
    class B{
      void display(){
        System.out.print("Class B");
      }
    }
    class C extends A,B{
      void display(){
        System.out.println("Class C");
      }
    }
    public static void main(String[] args) {
      A obj = new A();
      B obj1 = new B();
      C obj2 =new C();
    }
  }  */

interface A{
    void displayA();
  }
  interface B{
    void displayB();
  }
  class C implements A, B{
    public void displayA(){
      System.out.println("Interface A");
    }
    public void displayB(){
      System.out.println("Interface B");
    }
  }
  class Interface{
    public static void main(String[] args) {
      C obj =new C();
      obj.displayA();
      obj.displayB();
    }
  }

  /*5. Create a class named Shape with a method that prints "This is a shape". Create another
class named Polygon inheriting the Shape class with the same method that prints "Polygon is 
a shape". Create two other classes named Rectangle and Triangle having the same method which
prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another
class named Square having the same method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes. */

class Shape{
  void display(){
    System.out.println("This is a shape");
  }
}
class Polygon extends Shape{
  void display(){
    System.out.println("Polygon is a shape");
  }
}
class Rectangle extends Shape{
  void display(){
    System.out.println("Rectangle is a polygon");
  }
}
class Triangle extends Shape{
  void display(){
    System.out.println("Triangle is a polygon");
  }
}
class Square extends Triangle{
  void display(){
    System.out.println("Square is rectangle");
  }
}
class Question5{
  public static void main(String[] args) {
    Shape shape=new Shape();
    Polygon poly = new Polygon();
    Rectangle rect = new Rectangle();
    Triangle tri =new Triangle();
    Square sq= new Square();
    shape.display();
    poly.display();
    rect.display();
    tri.display();
    sq.display();
  }
}


/*6. Design and implement a custom Java class named MyString that mimics the behavior of 
Java’s built-in String class. Your class should store character data internally (e.g., using 
a char[] or String as input) and should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class. */



/*7. Design a calculator application using Java Inheritance.
‌
Create the following class hierarchy:
‌
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.
*/

class BasicCalculator{
    public int add(int a, int b){
      return a+b;
    }
    public int sub(int a, int b){
      return a-b;
    }
    public int multiply(int a, int b){
      return a*b;
    }
    public int division(int a, int b){
      return a/b;
    }
}
class AdvanceCalculator extends BasicCalculator{
  public double power(int base, int exponent){
    return Math.pow(base, exponent);
  }
  public int modulas(int a, int b){
    return a%b;
  }
  public double squareRoot(double a){
    return Math.sqrt(a);
  }
}
class ScientificCalculator extends AdvanceCalculator{
  public double sin(double angle){
    return Math.sin((Math.PI/angle));
  }
  public double cos(double angle){
    return Math.cos(angle);
  }
  public double log(double value){
    return Math.log(value);
  }
  public double exp(double value){
    return Math.exp(value);
  }
}

class Calculator{
public static void main(String args[]){
  ScientificCalculator obj3 = new ScientificCalculator();
  System.out.println("Basic Calculator...");
  System.out.println("Addition : "+obj3.add(2,3));
  System.out.println("Subraction : "+obj3.sub(2,4));
  System.out.println("Multiplication : "+obj3.multiply(2,3));
  System.out.println("Division : "+obj3.division(4,2));
  System.out.println("-----------------");
  System.out.println("Advanced calculator...");
  System.out.println("Power of : "+obj3.power(2, 3));
  System.out.println("Modulas : "+obj3.modulas(10, 2));
  System.out.println("SquareRoot : "+obj3.squareRoot(64));
  System.out.println("-----------------");

  System.out.println("Scientific Calculator...");
  System.out.println("Sin Value: "+obj3.sin(5));
  System.out.println("Cos Value: "+obj3.cos(5));
  System.out.println("Log Value: "+obj3.log(5));
  System.out.println("Exp Value: "+obj3.exp(5));
  System.out.println("-----------------");
  }
}

