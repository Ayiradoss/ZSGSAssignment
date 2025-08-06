/* 1. All the banks operating in India are controlled by RBI. RBI has set a well defined 
guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc)
which all banks must follow. For example, suppose RBI has set minimum interest rate applicable
to a saving bank account to be 4% annually; however, banks are free to use 4% interest rate or 
to set any rates above it. 
Write a program to implement bank functionality in the above scenario. Note: Create few classes
namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc).
Assume and implement required member variables and methods in each class. 
Hint: 
Class Customer 
{ 
//Personal Details ... 
// Few functions ... 
} 
Class Account 
{ 
// Account Detail ... 
// Few functions ... 
} 
Class RBI 
{ 
Customer c; //hasA relationship 
Account a; //hasA relationship 
.. 
Public double GetInterestRate() { } 
Public double GetWithdrawalLimit() { } 
} 
Class SBI extends public RBI 
{ 
//Use RBI functionality or define own functionality. 
} 
Class ICICI extends public RBI 
{ 
//Use RBI functionality or define own functionality. 
}  */

import java.util.Scanner;
class Customer{
    String name;
    int customerId;
    String address;
    String phonenumber;
    public Customer(String name, int customerId, String address, String phonenumber){
        this.name = name;
        this.customerId=customerId;
        this.address = address;
        this.phonenumber= phonenumber;
    }
   
    public void displayCustomerDetails(){
        System.out.println("Customer Name: "+name);
        System.out.println("Customer ID: "+customerId);
        System.out.println("Address: "+address);
        System.out.println("Phone Number: "+phonenumber);
    }
}

class Account{
    int accountNumber;
    String accountType;
    double balance;
    public Account(int accountNumber, String accountType, double balance){
        this.accountNumber= accountNumber;
        this.accountType= accountType;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount deposite successfull. Current balance:"+ balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount, double minimumBalance){
        if(balance-amount >=minimumBalance){
           balance -=amount;
           System.out.println("Amount withdrow successful. Current balacnce: "+balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    void displayAccountDetails(){
        System.out.println("AccountNumber: "+accountNumber);
        System.out.println("AccountType: "+accountType);
        System.out.println("AccountBalance: "+balance);
    }
}
class RBI{
    Customer c;
    Account a;
    private double minimumInterestRate;
    private double minimumBalanceAllowed;
    private double maximumWithdrawalLimit;

    public RBI(Customer c, Account a, double minimumInterestRate, double minimumBalanceAllowed, double maximumWithdrawalLimit){
        this.c= c;
        this.a =a;
        this.minimumInterestRate = minimumInterestRate;
        this.minimumBalanceAllowed= minimumBalanceAllowed;
        this.maximumWithdrawalLimit= maximumWithdrawalLimit;
    }

    public double getMinimumInterestRate(){
        return minimumInterestRate;
    }
    public double getMinimumBalanceAllowed(){
        return minimumBalanceAllowed;
    }
    public double getMaximumWithdrawalLimit(){
        return maximumWithdrawalLimit;
    }
    void displayRBIGuideLines(){
         System.out.println("Minimum Interest Rate: "+minimumInterestRate);
         System.out.println("Minimum Balance Allowed: "+minimumBalanceAllowed);
         System.out.println("Maximum Withdrawal Limit: "+maximumWithdrawalLimit);
    }
}
class SBI extends RBI{
    public SBI(Customer c, Account a){
        super(c, a, 5.0, 1000.0, 100000.0);
    }
    @Override
    public double getMinimumInterestRate(){
        return 5.0;
    }
    @Override
    public double getMaximumWithdrawalLimit(){
        return 100000;
    }
    public void displayBankDetails(){
        System.out.println("\n----SBI customer Details----");
        c.displayCustomerDetails();
        a.displayAccountDetails();
        displayRBIGuideLines();
    }
}
class ICICI extends RBI{
    public ICICI(Customer c, Account a){
        super(c,a, 4.5,1000.0, 75000);
    }
    @Override 
    public double getMinimumInterestRate(){
        return 4.5;
    }
    @Override
    public double getMaximumWithdrawalLimit(){
        return 75000;
    }
    public void displayBankDetails(){
        System.out.println("\n----ICICI customer Details----");
        c.displayCustomerDetails();
        a.displayAccountDetails();
        displayRBIGuideLines();
    }
}
class PNB extends RBI{
    public PNB(Customer c, Account a){
        super(c,a, 5.5,1000.0, 55000);
    }
    @Override 
    public double getMinimumInterestRate(){
        return 5.5;
    }
    @Override
    public double getMaximumWithdrawalLimit(){
        return 55000;
    }
    public void displayBankDetails(){
        System.out.println("\n----PNB customer Details----");
        c.displayCustomerDetails();
        a.displayAccountDetails();
        displayRBIGuideLines();
    }
}
class Qus1{
    public static void main(String[] args) {
        Customer c1 = new Customer("Dass", 101, "Tvl", "9345574034");
        Account a1 = new Account(12345,"SavingsAccount", 500000);
        SBI sbi = new SBI(c1, a1);
        
        System.out.println();
        Customer c2 = new Customer("Mathan", 102, "Sutamali", "9993272682");
        Account a2 = new Account(54321, "SalaryAccount", 500000);
        ICICI icici = new ICICI(c2, a2);

        Customer c3= new Customer("Karthi", 103, "Petta", "9375978232");
        Account a3 =new Account(32525, "BussinessAccount", 500000);
        PNB pnb = new PNB(c3, a3);

        sbi.displayBankDetails();
        icici.displayBankDetails();
        pnb.displayBankDetails();
        
        System.out.println("\n---ICICI withdraw Test---");
        a2.withdraw(5000, icici.getMinimumBalanceAllowed());
        System.out.println("\n---SBI deposit Test---");
        a1.deposit(3000);
    }
}

/*2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount).
Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a
main class where you can accept payment using different methods. */

interface PaymentMethod{
    abstract void pay(double amount);
}
class CreditCardPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("\n---Credit card Payment---");
        System.out.println("Amount : "+amount);
    }
}
class DebitCardPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("\n---Debit card payment---");
        System.out.println("Amount : "+ amount);
    }
}
class UPIPayment implements PaymentMethod{
   public void pay(double amount){
        System.out.println("\n---UPI Payement---");
        System.out.println("Amount : "+amount);
    }
}
class Qus2{
    public static void main(String args[]){
        CreditCardPayment cre = new CreditCardPayment();
        cre.pay(500.0);
        DebitCardPayment deb =new DebitCardPayment();
        deb.pay(600.0);
        UPIPayment upi = new UPIPayment();
        upi.pay(700.0);
        
    }
}

/*3. Create a Java application to manage employees in a company. Define an abstract class Employee with a method
 calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary()
 method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different
 types of employees using the Employee reference. */

 abstract class Employee{
    abstract void calculateSalary();
 }
 class FullTimeEmployee extends Employee{
    double monthlySalary;
    FullTimeEmployee(int id, String name, double monthlySalary){
        this.monthlySalary= monthlySalary;
    }
    @Override
    public void calculateSalary(){
        System.out.println("Monthly salary : "+ monthlySalary);
    }
 }
 class PartTimeEmployee extends Employee{
    double hourlyWork;
    double hourlySalary;
    PartTimeEmployee(int id, String name, double hourlyWork, double hourlySalary){
        this.hourlyWork= hourlyWork;
        this.hourlySalary = hourlySalary;
    }
    @Override
    public void  calculateSalary(){
        double salary = hourlyWork*hourlySalary;
        System.out.println("PartTime work Salary : "+ salary);
    }
 }
 class Qus3{
    public static void main(String args[]){
        FullTimeEmployee fe = new FullTimeEmployee(105, "Dass", 75000.0);
        PartTimeEmployee pe = new PartTimeEmployee(102, "Karthi", 4, 2000.0);
        fe.calculateSalary();
        pe.calculateSalary();
    }
 }

 /*4. Create a Java application to manage employees in a company. Define an Interface Employee with a
method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override
calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling
calculateSalary() on different types of employees using the Employee reference. */

 interface Employee2{
    abstract void calculateSalary();
 }
 class FullTimeEmployee2 implements Employee2{
    double monthlySalary;
    FullTimeEmployee2(int id, String name, double monthlySalary){
        this.monthlySalary= monthlySalary;
    }
    @Override
    public void calculateSalary(){
        System.out.println("Monthly salary : "+ monthlySalary);
    }
 }
 class PartTimeEmployee2 implements Employee2{
    double hourlyWork;
    double hourlySalary;
    PartTimeEmployee2(int id, String name, double hourlyWork, double hourlySalary){
        this.hourlyWork= hourlyWork;
        this.hourlySalary = hourlySalary;
    }
    @Override
    public void  calculateSalary(){
        double salary = hourlyWork*hourlySalary;
        System.out.println("PartTime work Salary : "+ salary);
    }
 }
 class Qus4{
    public static void main(String args[]){
        FullTimeEmployee2 fe = new FullTimeEmployee2(105, "Dass", 75000.0);
        PartTimeEmployee2 pe = new PartTimeEmployee2(102, "Karthi", 4, 2000.0);
        fe.calculateSalary();
        pe.calculateSalary();
    }
 }

 /*5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different
types of transportation modes such as Bus, Train, and Flight. 
Define a common interface or abstract class``Ticket with a methodbookTicket() that each transportation mode
must implement differently. 
Create classes``BusTicket,TrainTicket, and``FlightTicket that extend the abstract class or implement the interface. 
Demonstrate runtime polymorphism by calling thebookTicket() method using a reference of the base class/interface */
interface Ticket{
   void bookTicket();
}
class BusTicket implements Ticket{
    private String source;
    private String destination;
    BusTicket(String source, String destination){
        this.source = source;
        this.destination= destination;
    }
    public void bookTicket(){
        System.out.println("-----Bus Travel-----");
        System.out.println("Source: "+source+ " Destination: "+ destination);
    }
}
class TrainTicket implements Ticket{
    private String source;
    private String destination;
    TrainTicket(String source, String destination){
        this.source= source;
        this.destination = destination;
    }
   public void bookTicket(){
    System.out.println("-----Train Travel-----");
        System.out.println("Source: "+source+ " Destination: "+destination);
    }
}
class FlightTicket implements Ticket{
    private String source;
    private String destination;
    FlightTicket(String source, String destination){
        this.source =source;
        this.destination= destination;
    }
    public void bookTicket(){
        System.out.println("-----Flight Ticket-----");
        System.out.println("Source: "+source+" Destination: "+destination);
    }
}
class Qus5{
    public static void main(String[] args) {
        
        Ticket tic1 = new BusTicket("Tvl", "Madurai");
        Ticket tic2 = new TrainTicket("Tvl", "Chennai");
        Ticket tic3 = new FlightTicket("Chennai", "Switzerland");
        tic1.bookTicket();
        tic2.bookTicket();
        tic3.bookTicket();
    }
}