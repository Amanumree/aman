package numbers;

public class Strong_no {

	 public static void main(String[] args)
	 {
	  int num = 145;
	  int sum = 0;
	  int temp =num;
	  while(num!=0)
	  {
	    int d = num%10;
	    sum = sum+fact(d);
	    num = num/10;
	  }
	    
		if(sum==temp)
	   System.out.println(temp+" "+"its a strong no");
	    else
	   System.out.println("not a strong no"); 	
	  }
	  private static int fact (int d)
	  {
		int fact =1;
		for(int i=1;i<=d;i++)
		{
	    fact = fact*i;
	  }
		return fact;
 }
}

