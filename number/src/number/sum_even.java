package number;

import java.util.Scanner;

public class sum_even {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no");
	int  num = sc.nextInt();
	    int sum =0;
	    while(num!=0)
	    {
	    	int d = num%10;
	    	if(d%2==0)
	    {
	    	sum =sum +d;
	   }
	    num=num/10;	
	    }
	    System.out.println(sum);
}
}
