package numbers;

import java.util.Scanner;

public class exp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no");
	 int num =sc.nextInt();
	   int a=3; 
	 int pro=1;
	     while(a!=0)
	    {
	    	pro=pro*num;
	    	System.out.println(pro);
	      
	     a--;
	    }
}}

