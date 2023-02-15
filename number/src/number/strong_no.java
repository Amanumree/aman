package number;

import java.util.Scanner;

public class strong_no {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no");
	 int num =sc.nextInt();
	 int sum=0;
	 int temp=num;
	 while(num!=0)
	 {
	   int d=num%10;
	    sum = sum +fact(d);
	    num =num/10;
	 }
	 if (sum==temp)
	 
		 System.out.println(temp+" "+"it is a strong no");
	 else 
		 System.out.println(temp+" "+"it is  not a strong no");
}
	 static int fact(int d)
	 {
		 int fact=1;
		 for(int i=1;i<=d;i++)
		 {
		  fact = fact*i;
		 }
		 return fact;
}  
}

