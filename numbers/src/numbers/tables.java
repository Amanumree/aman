package numbers;

import java.util.Scanner;

public class tables {
      public static void main(String[] args) {
    	  Scanner a =new Scanner(System.in);
          System.out.println("enter the no");
           int num  = a.nextInt();
          int mul=0;
	    for(int i=1;i<=10;i++)
	{
		  mul=num*i;
		  System.out.println(num+"*"+i+"="+mul);
	}
}
}