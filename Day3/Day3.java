import java.util.Scanner;
import java.util.*;
/*1. Create a class named 'Student' with a string variable 'name'
 and an integer variable 'roll_no'. Assign the value of roll_no as '2'
  and that of name as "John" by creating an object of the class Student. */
class Student{
    String name;
    int rollno;
    public Student(String name, int rollno){
        this.name =name;
        this.rollno=rollno;
    }

    public static void main(String args[]){
       Student obj = new Student("Jhon", 2);
       System.out.println("Name : "+obj.name);
       System.out.println("Rollno : "+obj.rollno);
    }
}

/*2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no,
 String address) and store  */

 public class Student2{
    String name;
    int roll_no;
    int phone_no;
    String address;
    public Student2(String name, int roll_no, int phone_no, String address){
        this.name=name;
        this.roll_no=roll_no;
        this.phone_no= phone_no;
        this.address = address;
    }
    public static void main(String args[]){
        Student2 obj = new Student2("Dass",5,1234512345, "Tvl");
        System.out.println("Name : "+obj.name);
        System.out.println("Roll_no : "+obj.roll_no);
        System.out.println("Phone_no : "+obj.phone_no);
        System.out.println("address : "+obj.address);
    }
 }

/*3. Write a Java program where you define a class named Employee. Inside the class, define
 fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been
created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an 
object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and 
creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees. */

class Employee{
    String name;
    int empId;
    String designation;
    double salary;
    Employee(){
        System.out.println("No-arguments constructor : ");
        name ="Unknown";
        empId =0;
        designation = "Not Assigned";
        salary= 0.0;
    }
    Employee(String name, int empId, String designation, double salary){
        this.name =name;
        this.empId =empId;
        this.designation = designation;
        this.salary = salary;
    }
    Employee(Employee e){
        this.name = e.name;
        this.empId = e.empId;
        this.designation = e.designation;
        this.salary = e.salary;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Employee ID : " + empId);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
        System.out.println("--------------");
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.display();
        Employee emp2 = new Employee("John", 101, "Developer", 45000.0);
        emp2.display();
        Employee emp3= new Employee(emp2);
        emp3.display();
    }
}

/*4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID,
 brand name, and price, such that it can internally keep track of how many vehicles have been 
 created so far, without requiring manual counting from outside the class. */
 
class Vehicle{
    int vehicleId;
    String brandName;
    double price;
    static int vehicleCount = 0;
    Vehicle(int vehicleId, String brandName, double price) {
        this.vehicleId = vehicleId;
        this.brandName =brandName;
        this.price =price;
        vehicleCount++;
    }
    void display(){
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Price: " + price);
        System.out.println("---------------------------");
    }
    static void showTotalVehicles() {
        System.out.println("Total Vehicles Created: " + vehicleCount);
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(1, "Yamaha", 1200000);
        Vehicle v2 = new Vehicle(2, "Suzuki", 850000);
        Vehicle v3 = new Vehicle(3, "Bajaj", 900000);
        v1.display();
        v2.display();
        v3.display();
        Vehicle.showTotalVehicles();
    }
}

/*5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.
‌ */

class Store{
  static String storeName;
  static String storeLocation;
  ArrayList <Product> product= new ArrayList<>();
  static void setStoreDetails(String name, String location){
      storeName=name;
      storeLocation= location;
  }
  static void displayStoreDetails(){
    System.out.println("Store Details --------------");
    System.out.println("Store Name : "+ storeName);
    System.out.println("Store Location : "+ storeLocation);
  }
  public void addProduct(Product p){
    product.add(p);
  }
  public void setProducts(){
    for(Product p : product){
      p.displayProduct();
    }
  }
  class product{
    int productId;
    int price;
    String productName;
    int quantity;
  }
  public void Product(int productId, int price, String productName, int quantity){
    this.productId= productId;
    this.price = price;
    this.productName= productName;
    this.quantity= quantity;
  }
  void displayAllProducts(){
    System.out.println("ProductId : "+ProductId);
    System.out.println("Product price : "+ price);
    System.out.println("Product Name : "+ productname);
    System.out.println("Product quantity : "+ quantity);
  }
  public static void main(String[] args) {
    Product obj = new Product(1, "Sugar", 10, 1);
    Product obj1 = new Product(2, "Rice", 20, 2);
    Product obj2 = new Product(3, "Milk", 30, 3);
    product.displayProduct();
    product.displayAllProducts();
  }
}

/*6. Write a program that would print the information (name, year of joining, salary, address)
 of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output. */

class Employee2 {
    String name;
    int yearOfJoining;
    int salary;
    String address;
   

    Employee2(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary= salary;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee2 e1 = new Employee2("Robert", 1994,1000, "64C- WallsStreat");
        Employee2 e2 = new Employee2("Sam", 2000, 2000, "68D- WallsStreat");
        Employee2 e3 = new Employee2("John", 1999,3000, "26B- WallsStreat");

        System.out.format("%-10s %-15s %s   %s\n", "Name", "Year of joining", "Salary", "Address");
        System.out.format("%-10s %-15d %s   %s\n", e1.name, e1.yearOfJoining, e1.salary, e1.address);
        System.out.format("%-10s %-15d %s   %s\n", e2.name, e2.yearOfJoining, e2.salary, e2.address);
        System.out.format("%-10s %-15d %s   %s\n", e3.name, e3.yearOfJoining, e3.salary, e3.address);
    }
}
