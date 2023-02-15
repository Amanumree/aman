package numbers;

import java.util.Scanner;

public class main1{
	   
	    public static void print_pattern(int n)
	    {
	         /* Function to print the pattern */
	         for(int i=1;i<=n;i++)
	         {
	           for(int j=1;j<=i;j++)
	           {
	               System.out.print("*");
	           }
//	             for(int j=n;j>=i;j--)
//	             {
//	                   System.out.print(" ");
//	             }
//	            
//	           for(int j=1;j<=i;j++)
//	           {
//	               System.out.print("*");
// }
	            System.out.println();
	         }
	    }
	     public static void main(String[]args)
	    {
	        Scanner sc=new Scanner(System.in);
	        int n = sc.nextInt();
	        print_pattern(n);
	    }
	}
	        
	        
	        

