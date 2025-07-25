//1. Write a program that uses if statement to find the minimum of three numbers.
//javac -encoding UTF-8 YourFileName.java
//java YourFileName
import java.util.Scanner;
import java.util.*;
class Day2 {
    public static void main(String args[]){
	    int a=10, b=13, c=14;
		int min = a;
		if(b<min){
			System.out.print("Minimum value is : "+ b);
		}
		else if(c<min){
		    System.out.print("Minimum value is : "+ c);
		}
		else{
		   System.out.print("Mininum value is : "+ a);
		}
	}
}
// 2. Write a program to do the following patterns using for loop?
/*a) 1   1 b) R R R R
    1 1     R     R
     1      R R R R
    1 1     R   R
   1   1    R     R */

class Pattern1
{
	public static void main(String[] args)
	{
		int n = 5;
		isA_Pattern(n, 1);
		isB_Pattern(n, 'R');
	}
	
	public static void isA_Pattern(int n, int value)
	{
		System.out.println("This is A - Pattern");
		for(int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) 
            {
                if (j == i || j == n - 1 - i) 
                {
                    System.out.print(value + " ");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
		}
	}
	
	public static void isB_Pattern(int n, char ch)
	{
		System.out.println("This is A - Pattern");
		int rows = n;
		int cols = n;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if((j==0) || (i==0 && j < cols-1) || (i==2 && j<cols - 1) || (j==cols - 2 && i==1) || (i - j==1 && i>=3)) 
				{
                    System.out.print(ch + " ");
                } 
				else 
				{
                    System.out.print("  ");
                }
		    }
			System.out.println();
		}
	}
}

class Qa3{
  public static void main(String args[]){
    int[]arr ={1,2,3,2,1};
  int i=0;
  int num = 1;
  while(i<arr.length){
   int j=0;
   while(j<arr[i]){
	   System.out.print(num+" ");
	   num++;
	   j++;
  }
  System.out.println();
  i++;
  }
}
}

//

class Qa4{
  public static void main(String args[])
  {
     int i=0, r=5;
    do
    {
     int space=1, j=0;
         do{
         System.out.print(" ");
           space++;
           }while(space<=r-i);

      int num = 1;
        j=0;
     do
    {
      System.out.print(num+" ");
      num = num * (i - j)/(j + 1);
      j++;
    }while(j<=i);
        System.out.println();
        i++;
    }while(i<r);

    System.out.println();

    String s = "ZOHOCORPORATIONS";
     int idx = 0, row=1;
    do
   {
     int col=1;
     do
     {
       if(idx< s.length())
       System.out.print( s.charAt(idx) );
        idx++;
        col++;
     }while(col<=4);
     System.out.println();
     row++;
   }while(row<=4);
  }
}

//5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.

class Qa5 {
  public static void main(String args[]){
      int sum = 0;
	  int n = 14;
	  for(int i=0; i<=n; i+=2){
	    if(i%2!= 0){
		   continue;
		}
		else{
		 sum +=i;
		}
	  }
	  System.out.print(sum);
	  
  }
}

//6. Define a method to convert the decimal number to a binary number?

class Qa6{
   public static void main(String args[]){
      int n = 8;
	  decToBin(n);
   }
	  public static void decToBin(int n){
		  int temp = n;
	     String binary = "";
		 while(n!=0){
		  int rem = n%2;
		  binary = rem+binary;
		  n/=2;
		 }
		 System.out.print("Decimal : " + temp + " Binary : "+ binary);
	  }
}

//

class Qa7{
   public static void main(String args[]){
	 
      int percent = 85;
	  char grade;
	  if(percent>=85 && percent<=100){
		  grade ='A';
	     System.out.println("Using if the Grade is A");
	  }
	  else if(percent>=70){
		  grade='B';
	     System.out.println("Using if the Grade is B");
	  }
	
	  else if(percent>=50){ 
	  grade='C';
	     System.out.println("Using if the Grade is C");
	  }
      else{
		  grade='F';
	     System.out.println("Using if the result is Fail");
      }
	  switch(grade){
		  case 'A':
		  System.out.println("Using switch the grade is A");
		  break;
		  case 'B':
		  System.out.println("Using switch the grade is B");
		  break;
		  case 'C':
		  System.out.println("Using switch the grade is C");
		  break;
		  case 'F':
		  System.out.println("Using switch the result is Fail");
		  break;
		  default:
		  System.out.println("Invalid");
	  }	  
   }
}

//1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.

class p1{
   public static void main(String args[]){
      int[] arr = {11,1,2,3,4,5,6,7,8,9,10};
	  int sum=0;
	  for(int i=0; i<arr.length; i++){
		  if(arr[i]%2!=0)
		  sum+=arr[i];
      }
   System.out.print("Sum of odd is : "+sum);
   }
}

// 2.Write a program to take in 10 values and print only those numbers which are prime.

class p2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter 10 numbers : ");
	int[] nums = new int[10];
	for(int i=0; i<10; i++){
	   nums[i] = sc.nextInt();
	}
	System.out.print("Prime numbers are : ");
	for(int i =0; i<10; i++){
	  if(isPrime(nums[i])){
	     System.out.print(nums[i]+ " ");
	  }
	}
  }
  public static boolean isPrime(int n){
	  if(n<=1){
		  return false;
	  }
    for(int i=2; i<Math.sqrt(n); i++){
	   if(n%i==0){
		   return false;
	   }
	}
	return true;
}
}

//3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

class p3{
   public static void main(String args[]){
     int[] fibon= new int[30];
	 fibon[0]= 0;
	 fibon[1] = 1;
	 for(int i=2; i<30;i++){
	 fibon[i] = fibon[i-1]+fibon[i-2];
	 }
	 System.out.print("30 terms of fibonacce seriesis : ");
	 for(int i=0; i<30; i++){
	  System.out.print(fibon[i]+" " );
	 }
   }
}

//

class p4 {
   static void print(int x[], int n) {
      int singleSum =0, doubleSum =0;
      for(int i =0; i < n; i++) {
       int val=x[i];
	   if(val>=0 && val<=9){
	     singleSum+=val;
	   }
	   else if(val>=10 && val<=99){
	     doubleSum+=val;
	   }
	  } 
      System.out.println("Sum of single digit elements is : "+ singleSum);	  
	  System.out.println("Sum of double digit elements is : "+ doubleSum);
  }
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
	System.out.print("Enter array size: ");
      int len =sc.nextInt();
       int[] arr= new int[len];
	 System.out.println("Enter array elements: ");
       for(int i= 0; i< len; i++) {
        arr[i] =sc.nextInt();
        }
        print(arr,len);
  }
}

//
class p5{
  public static void main(String args[]){
      char[] x={'m','n','o','p'};
	  char[] y={'m','n','o','p'};
	  boolean iden = true;
	  if(x.length!=y.length){
		  iden = false;
	  }
	  else{
		  for(int i=0; i<x.length; i++){
			  if(x[i]!=y[i]){
			   iden =false;
			   break;
			  }
  }
}
if(iden){
  System.out.println("This arrays are identical");
}
else{
     System.out.println("This arrays are not identical");
}
  }
}


//
class p6{
  public static void main(String args[]){
    int[] year = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
	Arrays.sort(year);
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your year of graduation: ");
       int target = sc.nextInt();
	   boolean found = binarySearch(year, target);
	   if(found){
	      System.out.print("Record exists");
	   }
	   else{
	      System.out.print("Record does not exists");
	   }
  }
  public static boolean binarySearch(int[] arr, int target){
   int left =0;
   int right =arr.length-1;
   while(left<=right){
      int mid = left+(right -left)/2;
	  if(arr[mid]==target){
	    return true;
	  }
	  else if(arr[mid]<target){
	    left =mid+1;
	  }
	  else{
	    right=mid-1;
	  }
   }
   return false;
  }
}

//

class p7{
   public static void main(String args[]){
      double[] weigth = {32,45,72,53,25,63,67,34,74,52};
	  for(int i=0; i<weigth.length; i++){
	    int max = i;
		for(int j=i+1; j<weigth.length; j++){
		  if(weigth[j]>weigth[max]){
		    max = j;
		  }
		}
		double temp = weigth[i];
		weigth[i] = weigth[max];
		weigth[max] = temp;
	  }
	   System.out.println("\nWeigths in descending order:");
        for (int i = 0; i < 10; i++) {
            System.out.println(weigth[i]);
   }
   }
}

//

class p8{
   public static void main(String args[]){
   int[] age =new int[10];
       int lessThan18= 0, between18And60 =0, greaterThan60 = 0;
   Scanner sc =new Scanner(System.in);
      System.out.println("Enter the ages of 10 people:");
    for(int i=0; i<10; i++){
    age[i] = sc.nextInt();
  }
    for(int i = 0; i < 10; i++){
      if(age[i]<18){
      lessThan18++;
   }
      else if(age[i]<=60){
    between18And60++;
   }
      else{
   greaterThan60++;
  }
}
  System.out.println("Number of people less than 18: " + lessThan18);
      System.out.println("Number of people between 18 and 60: " + between18And60);
System.out.println("Number of people greater than 60: " + greaterThan60);

   }
}

//

class p9{
   public static void main(String args[]){
   int[] roll= new int[10];
   int[][] marks =new int[10][3];
     int[] total = new int[10];
    double[] avg =new double[10];
   Scanner sc = new Scanner(System.in);
    for(int i=0; i<10; i++){
   System.out.print("Enter roll no for student " + (i+1) + ": ");
      roll[i] = sc.nextInt();
    System.out.print("Enter marks in 3 subjects: ");
      for(int j=0; j<3; j++){
    marks[i][j] =sc.nextInt();
    total[i] +=marks[i][j];
  }
       avg[i] = total[i]/3.0;
   }
System.out.println("\nRollNo\tTotal\tAverage");
      for(int i=0; i<10; i++){
  System.out.println(roll[i] + "\t" + total[i] + "\t" + String.format("%.2f", avg[i]));
    }
 }
}

//

class p10{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
     System.out.print("Enter rows : ");
  int m = sc.nextInt();
     System.out.print("Enter columns : ");
  int n =sc.nextInt();
  int[][] A = new int[m][n];
    
	while(true){
   System.out.println("\nMenu:");
     System.out.println("1. Input elements into matrix");
      System.out.println("2. Display matrix");
   System.out.println("3. Sum of all elements");
      System.out.println("4. Row-wise sum");
     System.out.println("5. Column-wise sum");
   System.out.println("6. Transpose of matrix");
    System.out.println("7. Exit");
    System.out.print("Enter choice: ");
   int ch = sc.nextInt();
    if(ch==1){
    inputMatrix(A,m,n,sc);
    }
    else if(ch==2){
    displayMatrix(A,m,n);
    }
    else if(ch==3){
    sumMatrix(A,m,n);
    }
    else if(ch==4){
    rowSum(A,m,n);
    }
    else if(ch==5){
    colSum(A,m,n);
    }
    else if(ch==6){
    transpose(A,m,n);
    }
    else if(ch==7){
    break;
    }
    else{
    System.out.println("Invalid choice");
    }
    }
   }
   static void inputMatrix(int[][]A, int m, int n, Scanner sc){
       System.out.println("Enter elements:");
    for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
    A[i][j]=sc.nextInt();
  }
    }
   }
   static void displayMatrix(int[][]A, int m, int n){
      System.out.println("Matrix:");
     for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
   System.out.print(A[i][j]+" ");
  }
   System.out.println();
   }
   }
  static void sumMatrix(int[][]A, int m, int n){
    int s=0;
    for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
   s+=A[i][j];
   }
    }
    System.out.println("Sum of all elements: "+s);
}

  static void rowSum(int[][]A, int m, int n){
      for(int i=0; i<m; i++){
      int r=0;
      for(int j=0; j<n; j++){
      r+=A[i][j];
      }
     System.out.println("Sum of row "+(i+1)+": "+r);
     }
   }
  static void colSum(int[][]A, int m, int n){
      for(int j=0;j<n;j++){
      int c=0;
      for(int i=0; i<m; i++){
      c+=A[i][j];
      }
     System.out.println("Sum of column "+(j+1)+": "+c);
     }
   }
  static void transpose(int[][]A, int m, int n){
    System.out.println("Transpose:");
      for(int j=0; j<n; j++){
      for(int i=0;i<m;i++){
      System.out.print(A[i][j]+" ");
      }
      System.out.println();
      }
   }
}

/* 1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.*/

class st1{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
       System.out.print("Enter first binary string: ");
   String a = sc.nextLine();
       System.out.print("Enter second binary string: ");
   String b = sc.nextLine();
   String res = addBinary(a,b);
   System.out.println("Sum is: " + res);
  }
   static String addBinary(String a,String b){
   int i =a.length()-1;
   int j =b.length()-1;
   int carry = 0;
   String ans = "";
   while(i>=0 || j>=0 || carry!=0){
      int sum = carry;
     if(i>=0){
        sum+= a.charAt(i)-'0';
        i--;
      }
     if(j>=0){
        sum+= b.charAt(j)-'0';
        j--;
       }
      ans = (sum%2) + ans;
      carry= sum/2;
   }
   return ans;
   }
}

/* 2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1 */

class st2{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter column number: ");
   int n = sc.nextInt();
    String ans = convertTitle(n);
   System.out.println(ans);
   }
   static String convertTitle(int n){
   String res = "";
   while(n > 0){
   n--;
      int rem = n % 26;
    char ch = (char)('A' + rem);
      res = ch + res;
   n = n / 26; 
  }
   return res;
   }
}

/* 3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters. */

class st3{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter string: ");
   String s = sc.nextLine();
   String res = reverseVowels(s);
   System.out.println(res);
      }
   static String reverseVowels(String s){
   char[] arr = s.toCharArray();
       int i = 0;
      int j = arr.length-1;
  
   while(i<j && !isVowel(arr[i])){
   i++;
       }
   while(i<j && !isVowel(arr[j])){
   j--;
      }
   if(i<j){
      char temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
      j--;
   }
   return new String(arr);
      }
   static boolean isVowel(char ch){
   ch = Character.toLowerCase(ch);
   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
      return true;
     }
   else{
      return false;
   }
 }
}

/* 4. You are given two strings s and t.
‌
String t is generated by random shuffling string s and then add one more letter at a random position.
‌
Return the letter that was added to t.
‌
Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
‌
Example 2:
Input: s = "", t = "y"
Output: "y"
‌
Constraints:
0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lowercase English letters.*/

class st4{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter first string s: ");
   String s = sc.nextLine();
   System.out.print("Enter second string t: ");
   String t = sc.nextLine();
   char res = findAddedLetter(s,t);
   System.out.println(res);
  }
   static char findAddedLetter(String s, String t){
   int sum1 = 0, sum2 = 0;
   for(int i=0; i<s.length(); i++){
      sum1 += s.charAt(i);
  }
   for(int i=0; i<t.length(); i++){
      sum2 += t.charAt(i);
  }
   return (char)(sum2 - sum1);
   }
}

/* 5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting
 some (can be none) of the characters without disturbing the relative positions of the remaining 
 characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check
 one by one to see if t has its subsequence. In this scenario, how would you change your code?  */

class st5{
   public static void main(String args[]){
   Scanner sc =new Scanner(System.in);
   System.out.print("Enter s: ");
   String s =sc.nextLine();
   System.out.print("Enter t: ");
   String t=sc.nextLine();
   boolean res= isSubsequence(s,t);
   System.out.println(res);
 }
   static boolean isSubsequence(String s, String t){
   int i=0, j=0;
   while(i<s.length()&& j<t.length()){
      if(s.charAt(i)==t.charAt(j)){
         i++;
        }
      j++;
  }
   if(i==s.length()){
      return true;
   }
   else{
      return false;
   }
   }
}

/*6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.  */

class st6{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
	System.out.print("Enter fitst String : ");
	String num1 = sc.nextLine();
	System.out.print("Enter second String : ");
	String num2 =sc.nextLine();
     System.out.print(addString(num1, num2));
  }
  public static String addString(String num1,String num2){
   StringBuilder sb = new StringBuilder();
	int carry=0;
	for(int i=num1.length()-1, j=num2.length()-1; i>=0|| j>=0 || carry==1; i--, j--){
	   int a = i<0 ? 0 : num1.charAt(i) -'0';
	   int b = j<0 ? 0 : num2.charAt(j) -'0';
	   sb.append((a+b+carry)%10);
	   carry = (a+b+carry)/10;
	}
	return sb.reverse().toString();
  }
}

/*7. Given a string s, return the number of segments in the string.
A segment is defined to be a contiguous sequence of non-space characters.
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '. */
class st7{
    public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter sentance : ");
     String s =sc.nextLine();

     String[] word = s.trim().split("\\s+");
     System.out.print("Enter number of words : "+word.length);
    }
}


/* 8. We define the usage of capitals in a word to be right
when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters. */

class st8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine();
        System.out.print(detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word) {
        int lower = 0;
        int upper = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                lower++;
            } else if (Character.isUpperCase(word.charAt(i))) {
                upper++;
            }
        }

        if (lower == word.length() || 
            upper == word.length() || 
            Character.isUpperCase(word.charAt(0)) && lower == word.length() - 1) {
            return true;
        }

        return false;
    }
}
