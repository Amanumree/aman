package number;

import java.util.Scanner;

public class table {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no");
	int num =sc.nextInt();
	for(int i=1;i<=10;i++)
	{
	  int temp=num*i;
	System.out.println(num+"*"+i+" ="+temp);
	}
	
}
}
