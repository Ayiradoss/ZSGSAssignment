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