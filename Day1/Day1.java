/* 1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?
2. Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.
3. Write a program to find the maximum of two numbers using ternary operator.
4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?
5. Write a program that illustrate the execution order of static block and initializer block?
6. Write a program that illustrate the Explicit type casting?
7. Write a program to check if a number is a power of 2?
8. Write a program to find the first set bit of a number?
9. Write a class Employee with attributes empId, name, department and salary and define
 a parametrized constructor Employee(int empId, String name, String department, double salary) 
 and assign these variables to instance variables accordingly and display them?
10. Write a program to check whether the object is an instance of a particular class? */


class Day1{
    int instance;
	static int stat;
	public static void main(String args[]){
		Day1.stat = 25;
		Day1 obj = new Day1();
		obj.instance = 35;
		final int fin = 23;
	   int local = 10;
	   if(local%2==0){
		   int block = 30;
		   System.out.println("Blockvariable : "+ block);
	   }
	   System.out.println("final variable : " + fin );
	  System.out.println("Local variable : "+local);
	  System.out.println("Static variable : "+stat);
	  System.out.print("Instance variable : "+obj.instance);
	}
} 


//2. Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.
class Qa2{
	public static void main(String args[]){
		int a = 10;
		short b = 257;
		byte c= 126;
		long d =1234585345;
        float e = 23.42524f;
        double f = 24.343947539385034;
        char g = 'A';
		boolean h = true;
		System.out.println("int : "+a);
		System.out.println("short : "+b);
		System.out.println("byte : "+c);
		System.out.println("Long : "+ d);
		System.out.println("folat : "+ e);
		System.out.println("double : "+ f);
		System.out.println("Char : "+ g);
		System.out.println("boolean : "+ h);
	}
	} 


//3. Write a program to find the maximum of two numbers using ternary operator.
class Qa3{
public static void main(String args[]){
   int number1 = 18;
   int number2= 15;
   System.out.print((number1>number2) ? "number1 is maximum" : "number2 is maximum");
   }
}


//4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?

class Qa4{
    public static void main(String args[]){
	   int a = 6; 
	   int b = 6;
	   int xor= a^b;
	   boolean[] arr = new boolean[xor+1];
	   arr[xor] = true;
	   if(arr[0]){
	     System.out.print("a and b are equal");
	   }
	   else{
	      System.out.print("a and b are not equal");
	   }
	}
}

//5. Write a program that illustrate the execution order of static block and initializer block?

class Qa5{
	int speed;
	{
	     speed = 230;
	}
	{
		System.out.println("20");
	}
	static{
	System.out.println("Static method first executed");
	}
		public static void main(String args[]){
		Qa5 obj = new Qa5();
	   System.out.println("Object value is : "+ obj.speed);
	}
}

//6. Write a program that illustrate the Explicit type casting?

class Qa6{
  public static void main(String args[]){
     double value = 17.5783458678;
	 float value1 = (float) value;
	 System.out.println("Original value : "+ value);
	 System.out.print("After explict : "+value1);
  }
}

//7. Write a program to check if a number is a power of 2?

class Qa7{
  public static void main(String args[]){
    int n = 16;
	while(n%2==0)
	{
		n/=2;
	}
	System.out.println(n==1?"Yes":"no");
  }
}

//8. Write a program to find the first set bit of a number?

class Qa8{
   public static void main(String args[]){
	   int n = 14;
	   if(n==0){
		   System.out.print("Set bit is : 0");  
	   }
	  int pos = 1;
	  String bin = "";
	  while(n!=0){
	    int rem = n%2;
        bin = rem+bin;
        n/=2;		
	 }
	 for(int i = bin.length()-1; i>=0; i--){
	    if(bin.charAt(i) =='0'){
		   pos++;
		}
		else{
			break;
	}
	 }
	 System.out.print("Set bit is : "+ pos);
   }
}
/*9. Write a class Employee with attributes empId, name, department and salary and define
 a parametrized constructor Employee(int empId, String name, String department, double salary) 
 and assign these variables to instance variables accordingly and display them?*/

class Employee{
	    int empId;
		String name;
		String department;
		double salary;
	    Employee(int empId, String name, String department, double salary){
	       this.empId = empId;
		   this.name = name;
		   this.department = department;
		   this.salary = salary;
		   } 
		   public void display(){
		    System.out.print("\nEmployee id : "+ empId + "\nEmployee name : "+ name+ "\nEmployee department : "+ department + "\nEmployee salary : " + salary);
		   } 
    public static void main(String args[]){
	    Employee obj = new Employee(16, "Ayiradass", "Bsc cs", 15000.0);
		obj.display();
	}
}

//10. Write a program to check whether the object is an instance of a particular class?

class Qa10 {
	int variable;
    public static void main(String[] args) {
		Qa10 obj = new Qa10();
		obj.variable = 10;
		if(obj instanceof Qa10){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
