package Arraywithparameter;

public class Integer 
{
	static void disp(int[] akk)
	{
		System.out.println("index \t values");
		for(int i=0; i<akk.length;i++)
		{
			System.out.println(akk[i]);
		}
	}
public static void main(String[] args) 
{
	int[] arr={10,20,30,40};
	disp(arr);
}
}
