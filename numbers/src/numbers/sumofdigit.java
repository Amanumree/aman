package numbers;

import java.util.Scanner;

public class sumofdigit {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    System.out.println("enter the digit");
    int no=sc.nextInt();
     int sum=0;
     while(no!=0)
     {
    	 int d=no%10;
    	 sum =sum+d;
    	 no=no/10;
     }
   System.out.println(sum);
}
}
