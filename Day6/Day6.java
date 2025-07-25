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
    private String monthlysalary;

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
     double annualSalary(double monthlysalary){
        return monthlysalary*12;
    }
    public static void main(String args[]){
        Employee obj = new Employee();
        System.out.println("EmployeeID : "+obj.setEmployeeID(1300));
        System.out.println("Employee name : "+obj.setName("Ayiradoss"));
        System.out.println("Designation : "+ obj.setDesignation("Software developer"));
        System.out.println("Department : "+obj.setDepartment("IT"));
        System.out.println("Monthly salary : "+obj.setMonthlySalary(70000.000));
        System.out.println("Annual Salary : "+obj.annualSalary());
    }
}