package number;

import java.util.Scanner;

public class amstrong_no {
	public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   System.out.println("enter the no");  
   int num =sc.nextInt();
     int copy =num;
     int d1= num%10;
     int d2=num/10;
     int sum =d1+d2+d1*d2;
     if(sum==num)
    	 System.out.println(copy+" "+"it is special no");
    	 else 
    		 System.out.println(copy+" "+"it is not a special no");	 
     }
     
     
}
