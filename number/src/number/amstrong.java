package number;
 
import java.util.Scanner;

public class amstrong {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
	int copy =num;
	int sum = 0;
	while(num!=0)
	{
		int d=num%10;
		sum =sum +power(d,count(copy));
		num=num/10;
	}
 
	if(sum==copy)
		System.out.println(copy+" is amstrong no");
	else
		System.out.println(copy+"is not amstrong no");
 }
  static int power(int base,int exp)
	{
	  int prod =1;
	  while(exp!=0)
	  {
		  prod =prod*base;
		  exp--;
	  }
	  return prod;
	}
  static int count(int num)
  {int count=0;
  while(num!=0)
  {
	  num=num/10;
	  count++;
	 }
  return count;
  }
}