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

/*3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
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

/*6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output. */

class Employee2 {
    String name;
    int yearOfJoining;
    String address;

    Employee2(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee2 e1 = new Employee2("Robert", 1994, "64C- WallsStreat");
        Employee2 e2 = new Employee2("Sam", 2000, "68D- WallsStreat");
        Employee2 e3 = new Employee2("John", 1999, "26B- WallsStreat");

        System.out.format("%-10s %-15s %s\n", "Name", "Year of joining", "Address");
        System.out.format("%-10s %-15d %s\n", e1.name, e1.yearOfJoining, e1.address);
        System.out.format("%-10s %-15d %s\n", e2.name, e2.yearOfJoining, e2.address);
        System.out.format("%-10s %-15d %s\n", e3.name, e3.yearOfJoining, e3.address);
    }
}
