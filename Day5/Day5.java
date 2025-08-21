/*1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed. */
import java.util.Scanner;

class MedicalRecord{
    protected int recordId;
    protected String patientName;
    protected int dateOfVisit;
    protected String diagnosis;

    public void inputRecordDetails(Scanner sc){
       System.out.print("Enter RecordID :");
       recordId = sc.nextInt();
       System.out.print("Enter Patient Name : ");
       patientName = sc.next(); 
       System.out.print("Enter Date Of Visit : ");
       dateOfVisit = sc.nextInt();
       System.out.print("Enter Diagnosis : ");
       diagnosis = sc.next();
    }
    public void displayRecord(){
        System.out.println("-------Medical Records------");
        System.out.println("Record Id : "+recordId);
        System.out.println("Patient Name : "+ patientName);
        System.out.println("Date of visit : "+ dateOfVisit);
        System.out.println("Diagnosis : "+ diagnosis);
    }
}
class InPatientRecord extends MedicalRecord{
    int roomNumber;
    int numberOfDaysAdmitted;
    int roomCharges;
    
    InPatientRecord(int roomNumber, int numberOfDaysAdmitted, int roomCharges){
       this.roomNumber= roomNumber;
       this.numberOfDaysAdmitted = numberOfDaysAdmitted;
       this.roomCharges = roomCharges;
    }
   /*  public int getNumberOfDaysAdmitted(){
       return numberOfDaysAdmitted;
    }
    public int getRoomCharges(){
        return roomCharges;
    }*/
    public int calculateTotalCharges(){
       return roomCharges*numberOfDaysAdmitted;  
    }
    public void displayRecord(){
       super.displayRecord();
       System.out.println("-------InPatient Details-------");
       System.out.println("Room Number : "+ roomNumber);
       System.out.println("Number of Days Adimmited : "+ numberOfDaysAdmitted);
       System.out.println("Room Charges : "+ roomCharges);
       System.out.println("Total Amount : "+ calculateTotalCharges());
    }
}
class OutPatientRecord extends MedicalRecord{
    String doctorName;
    int consultationFee;
    OutPatientRecord(String doctorName, int consultationFee){
        this.doctorName= doctorName;
        this.consultationFee= consultationFee;
    }
    public void displayRecord(){
        super.displayRecord();
        System.out.println("---------OutPatient Details--------");
        System.out.println("Doctor Name : "+ doctorName);
        System.out.println("Consultation : "+ consultationFee);
    }

}
class Qus1{
public static void main(String args[]){
    MedicalRecord obj = new MedicalRecord();
    Scanner sc =new Scanner(System.in);
    
    System.out.println("Enter your Choice ");
    System.out.println("1. In Patient details : ");
    System.out.println("2. Out Patient details : ");
    int choice = sc.nextInt();
    
    switch(choice){
        case 1:
            InPatientRecord obj2 = new InPatientRecord(105, 5, 500);
            obj2.calculateTotalCharges();
            obj2.inputRecordDetails(sc);
            obj2.displayRecord();
            break;
        case 2: 
            OutPatientRecord obj1 = new OutPatientRecord("Dass", 5000);
            obj1.inputRecordDetails(sc);
            obj1.displayRecord();
            break;
        default:
        System.out.println("Invalid Choice");
          
    }
   
}
}

/*2. Can we override private method, constructor, static method, final method?
     Illustrate with an example.*/

class Parent{
    private void privMethod(){
        System.out.println("Parent class Private method");
    }
    Parent(){
        System.out.println("Parent constructor");
    }
    static void stMethod(){
        System.out.println("Parent class Static method");
    }
    final void finMethod(){
        System.out.println("Parent class Final method");
    }
 }
 class Child extends Parent{
     private void privMethod(){
        System.out.println("Child class Private method");
    }
    Child(){
        System.out.println("Child constructor");
    }
    static void stMethod(){
        System.out.println("Child class Static method");
    }
    /*final void finMethod(){
        System.out.println("Child class Final method");
    }*/
 }
 class Qus2{
    public static void main(String args[]){
        Parent obj = new Child();
        //obj.privMethod();
        obj.stMethod();
        obj.finMethod();
    }
}

/* 3. Create a Java application to manage employees in a company. Define a base class
Employee with a method calculateSalary(). Then create three subclasses FullTimeEmployee,
PartTimeEmployee and ContractEmployee that override calculateSalary() method based on their
working type. */

class Employee{
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void calculateSalary(){
        System.out.println("Calculating Salary for Employee");
    }
    public void displayDetails(){
        System.out.println("Id : "+ id+","+" Name : "+name);
    }
}

  class FullTimeEmployee extends Employee{
    double monthlySalary;
    FullTimeEmployee(int id, String name, double monthlySalary){
    super(id, name);
    this.monthlySalary = monthlySalary;
    }
    @Override
    public void calculateSalary(){
       System.out.println("FullTime Salary : "+monthlySalary);
    }
  }
  class PartTimeEmployee extends Employee{
    int hourlyWork;
    double hourlySalary;
    PartTimeEmployee(int id, String name, int hourlyWork, double hourlySalary){
        super(id, name);
        this.hourlyWork = hourlyWork;
        this.hourlySalary = hourlySalary;
    }
    @Override
    public void calculateSalary(){
        double salary = hourlyWork*hourlySalary; 
       System.out.println("PartTime salary : "+ salary);
    }
  }
  class ContractEmployee extends Employee{
    double contractSalary;
    ContractEmployee(int id, String name, double contractSalary){
        super(id, name);
        this.contractSalary=contractSalary;
    }
    @Override
    public void calculateSalary(){
       System.out.println("Contract salary : "+ contractSalary);
    }
  }
  class Qus3{
    public static void main(String[] args) {
        FullTimeEmployee obj = new FullTimeEmployee(1, "Karthi",50000.50);
        PartTimeEmployee obj2 = new PartTimeEmployee(2, "Dass", 4, 500.50);
        ContractEmployee obj3 = new ContractEmployee(3,"Mahali", 5000.50);
        obj.displayDetails();
        obj.calculateSalary();
        obj2.displayDetails();
        obj2.calculateSalary();
        obj3.displayDetails();
        obj3.calculateSalary();
    }
  }


  /*4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common
   method but implement booking differently. */
  abstract class Ticket{
    String travelerName;
     abstract void bookTicket();
  }
  class BusTicket extends Ticket{
    @Override
    void bookTicket(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Traveler Name for Bus: ");
        travelerName = sc.nextLine();
        System.out.println("Bus Ticker Booked for "+travelerName+ " no seat selection");
    }
  }
  class TrainTicket extends Ticket{
    @Override
    void bookTicket(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Traveler Name for Train : ");
        travelerName =sc.nextLine();
        System.out.println("Enter Coach Type (Sleeper/AC) ");
        String coachType = sc.nextLine();
        System.out.println("Train ticket booked for "+travelerName+" in "+ coachType+ " Coach");
    }
  }
  class FlightTicket extends Ticket{
    @Override
    void bookTicket(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter traveler Name for flight : ");
        travelerName = sc.next();
        System.out.println("Enter passport number : ");
        int passport = sc.nextInt();
        System.out.println("Meal preference Veg/Nonveg");
        String meal= sc.next();
        System.out.println("Flight booked for "+ travelerName+ " with passport: "+passport+" Meals: "+ meal);
    }
  }
  class Qus4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket ticket;
        System.out.println("Choose transport type : 1. Bus 2. Train  3. Flight");
        int choose = sc.nextInt();
        sc.nextLine();
        switch(choose){
            case 1:
            new BusTicket().bookTicket();
            break;
            case 2:
            new TrainTicket().bookTicket();
            break;
            case 3:
            new FlightTicket().bookTicket();
            break;
            default:
            System.out.println("Invalid choice");
            break;
        }
    }
  }