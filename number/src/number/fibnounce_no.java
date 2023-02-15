package number;
import java.util.Scanner;
public class fibnounce_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int fib1 =sc.nextInt();
	int fib2 = sc.nextInt();

	  int fib3;
	  System.out.println(fib1+" "+fib2);
	  for(int i=1;i<=10;i++)
	  {
		 fib3=fib1+fib2;
	  System.out.println(fib3);
	    fib1=fib2;
	    fib2=fib3;
}
}
}