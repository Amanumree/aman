package numbers;

import java.util.Scanner;

public class fibnoncies {
	public static void main(String[] args) {
	Scanner a =new Scanner(System.in);
    System.out.println("enter the first no");
     int fib1  = a.nextInt();
     System.out.println("enter the sec no");
     int fib2 = a.nextInt();
     int fib3=0;
             
      for(int i=0;i<=13;i++) {
    	  fib3= fib1+fib2;
    	  System.out.println(fib3);
      
      fib1=fib2;
      fib2=fib3;
}
      }
	}
