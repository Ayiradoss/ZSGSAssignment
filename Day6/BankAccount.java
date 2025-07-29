/* 1. Illustrate the concept-Encapsulation with the Payment Gateway System.
[The class should encapsulate private data members such as transaction ID, 
payer name, payee name, amount, payment method, and transaction status. 
Provide appropriate public getter and setter methods to access and modify these
 details securely. Also include a method to display the transaction summary. */
 import arithmetic.Arithmetic;
 import stringutils.Stringut;
 class Gateway
 {
        private String transaction_ID;
        private String payer_name;
        private String payee_name;
        private int amount;
        private String payment_method;
        private String transaction_status;

        void setTransaction_ID(String transaction_ID){
            this.transaction_ID =transaction_ID;
        }
        String getTransaction_ID(){
            return transaction_ID;
        }
        void setPayer_name(String payer_name){
            this.payer_name= payer_name;
        }
        String getPayer_name(){
            return payer_name;
        }
        void setPayee_name(String payee_name){
            this.payee_name= payee_name;
        }
        String getPayee_name(){
            return payee_name;
        }
        void setAmount(int amount){
            this.amount= amount;
        }
        int getAmount(){
            return amount;
        }
        void setPayment_method(String payment_method){
            this.payment_method= payment_method;
        }
        String getPayment_method(){
            return payment_method;
        }
        void setTransaction_status(String transaction_status){
            this.transaction_status= transaction_status;
        }
        String getTransaction_status(){
            return transaction_status;
        }

        void display(){
        System.out.println("Transaction : "+getTransaction_ID());
        System.out.println("Payer : "+getPayer_name());
        System.out.println("Payee : "+getPayee_name());
        System.out.println("Amount : "+getAmount());
        System.out.println("Payment method : "+getPayment_method());
        System.out.println("Transaction status : "+getTransaction_status());
    }
    public static void main(String[] args) {
        Gateway obj = new Gateway();
        obj.setTransaction_ID("IOB12345");
        obj.setPayer_name("Dass");
        obj.setPayee_name("Karthik");
        obj.setAmount(900);
        obj.setPayment_method("UPI");
        obj.setTransaction_status("Failed");
        obj.display();
        
    }
 }

 /* 2. Create a Java application that demonstrates the use of user-defined packages by
  organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the
 following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the
 usage of all the methods. */

 class packages{
    public static void main(String args[]){
        Arithmetic obj= new Arithmetic();
        System.out.println("Addition : "+obj.Addition(5,5));
        System.out.println("Subraction : "+obj.Subtraction(5,5));
        System.out.println("Multiplication : "+obj.Multiplication(5,5));
        System.out.println("Division : "+obj.Division(5,5));
        System.out.println("Modulo : "+obj.Modulo(5,5));
        
        Stringut obj1= new Stringut();
        System.out.println("Concatenating : "+obj1.Concatenating("Ayira", "dass"));
        System.out.println("Reversing : "+obj1.Reverse("Ayiradass"));
        System.out.println("Length of String : "+ obj1.strLength("Ayiradass"));
    }
 }
 /*3. Design a class`Employee with private data members: employee ID, name, designation,
  department, and monthly salary. Use proper getter and setter methods to access and update 
  these fields. Add a method to calculate and return the annual salary of the employee.
‌ */

class Employee{
    private int employeeID;
    private String name;
    private String designation;
    private String department;
    private double monthlysalary;

    void setEmployeeID(int employeeID){
        this.employeeID= employeeID;
    }
    int getEmployeeID(){
        return employeeID;
    }
    void setName(String name){
        this.name= name;
    }
    String getName(){
        return name;
    }
    void setDesignation(String designation){
        this.designation=designation;
    }
    String getDesignation(){
        return designation;
    }
    void setDepartment(String department){
        this.department= department;
    }
    String getDepartment(){
        return department;
    }
    void setMonthlySalary(double monthlysalary){
        this.monthlysalary = monthlysalary;
    }
    double getMonthlySalary(){
        return monthlysalary;
    }
     public double annualSalary(){
        return getMonthlySalary()*12;
    }
    public static void main(String args[]){
        Employee obj = new Employee();
        obj.setEmployeeID(1300);
        obj.setName("Ayiradoss");
        obj.setDesignation("Software developer");
        obj.setDepartment("IT");
        obj.setMonthlySalary(70000.000);
        System.out.println("Employee Details : ");
        System.out.println("EmployeeID : "+obj.getEmployeeID());
        System.out.println("Employee name : "+obj.getName());
        System.out.println("Designation : "+ obj.getDesignation());
        System.out.println("Department : "+obj.getDepartment());
        System.out.println("Monthly salary : "+obj.getMonthlySalary());
        System.out.println("Annual Salary : "+obj.annualSalary());
    }
}

/* 6. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
Create two classes:
---Store
---Product
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
Task: Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
Also Check how many .class files are generated. */

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }

    // Main method
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("1234567890", "DassAnnaa", 5000.0);
        acc.displayDetails();

        acc.deposit(1500.0);
        acc.withdraw(2000.0);
        acc.withdraw(6000.0);  // Should not allow

        acc.displayDetails();
    }
}
