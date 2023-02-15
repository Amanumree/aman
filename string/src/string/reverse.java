package string;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
				String s= sc.nextLine();
		  String[]str=s.split("");
		  String rev =("");
		  for(int i=str.length-1;i>=0;i--)
		  {
			  rev=rev+str[i]+" ";		 
		}
		  System.out.println(rev);
	}

}
