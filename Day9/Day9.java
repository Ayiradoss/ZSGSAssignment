/* 1. int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution. */
import java.io.*;
import java.lang.*;
import java.util.InputMismatchException; 
import java.util.Scanner;

import javax.naming.AuthenticationException;
class Qus1{
    public static void main(String args[]){
        
        try{
            int[] arr ={2,5,1,4,0,7};
            int quotient = arr[7]/arr[4];
            System.out.println("Quotient: "+ quotient);
        }
        catch(Exception e){
            System.out.println("ArrayIndexOutOfbounds error throws");
        }
    }
}

/* 2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, 
and perform division, and catch the following exceptions: InputMismatchException, NumberFormatException,
ArithmeticException and Exception. */


class Qus2{
    public static void main(String[] args) {
    try{
        String str1 = "23";
        String str2 = "2a";
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int result = num1 / num2;
        System.out.println("Result: "+ result);
    }
    catch(InputMismatchException e){
        System.out.println("InputMismatchException throws");
    }
    catch(NumberFormatException e){
        System.out.println("NumberFormatException throws");
    }
    catch(ArithmeticException e){
        System.out.println("ArithmeticException throws");
    }
    catch(Exception e){
        System.out.println("Exception occurs: "+e.getMessage());
    }
    finally{
    System.out.println("Program ends");
    }
    }
} 
/*3. Write a program to illustrate how to throw a ClassNotFoundException. */
class Qus3{
        public static void main(String[] args) {
            try{
                Class.forName("file.name.assignment");
                System.out.println("File found successfully");
            }
            catch(ClassNotFoundException e){
                System.out.println("Error: Class not found "+e.getMessage());
            }
        }
}

/*4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number.
Handle it using try-catch. */

class Qus4{
   public static int validNum(String str) throws NumberFormatException{
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        String input = "23a";
        try{
          int number = validNum(input);
          System.out.println("Parsed integer: "+number);
        }
        catch(NumberFormatException e){
            System.out.println("Error: Invalid number format "+ e.getMessage());
        }
    }
}

/*5. Create a program where try block contains a return statement. Ensure that finally block executes
 before the method returns. Show this with output. */

 class Qus5{
    public static int testMethod(){
        try{
            System.out.println("In try block");
            return 10;
        }
        finally{
            System.out.println("In finally block");
        }
    }
        public static void main(String args[]){
            int result =testMethod();
            System.out.println("Returned value: "+ result);
        }
 }

 /* 6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether
  it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.*/

class Qus6{
   public static void main(String args[]) throws IOException{
        Scanner sc= new Scanner(System.in);
        try{
            System.out.print("Enter ATM Pin: ");
        String str = sc.nextLine();
        if(str.charAt(0)=='0'){
            throw new Exception("FirstLetter0Exception");
        }
        if(str.length()!=4){
            throw new Exception("LengthOutOfBoundsException");
        }
        for(int i = 0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                throw new Exception("NumericCharacterException");
            }
        }
        System.out.println("Vaild");
    }
    catch(Exception e){
        System.out.println("Error: "+ e.getMessage());
    }
   }
}

/*7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2
 calls method3, which throws the exception). Handle the exception in method1. */

 class Qus7{
    public static void main(String args[]){
        method1();
    }
    static void method1(){
        try{
            method2();
        }
        catch(Exception e){
            System.out.print("Error: "+ e.getMessage());
        }
    }
    static void method2() throws Exception{
        method3();
    }
    static void method3() throws Exception{
        throw new Exception("Error occur");
    }
 }

 /*8. Design a login system that throws AuthenticationException if the username or password is incorrect.
  Handle it and display a login failure message. */

  class Qus8{
    public static void main(String args[]) throws AuthenticationException{
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter your Username: ");
        String getusername = sc.nextLine();
        System.out.print("Enter your password: ");
        String getpassword = sc.nextLine();
            String username = "Dass";
            String password = "123dass";

            if(!(getpassword.equals(password)) ||  !(getusername.equals(username))){
                throw new Exception("AuthenticationException");
            }
           System.out.println("Username and password is valid");
        }
        catch(Exception e){
            System.out.print("Error: "+e.getMessage());
        }
    }
  }

  /*9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using
   try-catch-finally. */

class Qus9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    }
}

/*10. Write a Java program to manage a voting system where a person must be at least 18 years old to be
 eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register
 for voting. Display appropriate messages for eligible and ineligible voters. */

 class Qus10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        try{
            if(age<18){
                throw new Exception("AgeNotEligibleException");
            }
            System.out.println("You are eligible to vote");
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
 }