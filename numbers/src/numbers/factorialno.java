package numbers;

import java.util.Scanner;

public class factorialno {
 public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the no");
     int no=sc.nextInt();
       int fact=1;
       for(int i=no;i>=1;i--) {
                 fact =fact*i;  
         }
       System.out.println(fact);
         
 
 }
 }
