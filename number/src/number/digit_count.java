package number;

import java.util.Scanner;

public class digit_count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the no");
		long num= sc.nextLong();
		  int count=0;
		  while(num!=0)
		  {
			  num =num/10;
			  count++;
		  }
		  System.out.println(count);
	}

}
