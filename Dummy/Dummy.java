import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the length of row : ");
      int n = sc.nextInt();
      for(int i=1; i<=n; i++){
          int a=i;
          for(int j=1; j<=i; j++){
              System.out.print(a+" ");
              a+=n;
       }
       System.out.println();
      }
    }
}