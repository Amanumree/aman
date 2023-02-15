package numbers;

import java.util.Scanner;

public class digitcount {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    System.out.println("enter the digit");
    int no=sc.nextInt();
     int count=0;
     int num=0;
   while(no!=0)
   {
	        no=no/10;
	        count++;
   }
    System.out.println(count);


}
}
