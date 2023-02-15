package Arraysprogram;

public class evenandodd {
public static void main(String[] args) 
{
	int arr[]= {20,3,9,40,50,60,5,1,2,3,4,5,6,7,8,9};
	int counteven=0;
	int countodd=0;

	int evenindex=0;
	int oddindex=0;
	
	for(int i=0;i<arr.length;i++)
     {
		if(arr[i]%2==0) 
		{
			evenindex++;	
		}
		else {
    	oddindex++;
    	 
		}
     }
	int odd[]= new int[oddindex];
	int even[]=new int[evenindex];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			even[counteven++]=arr[i];
		}
		else
		{
			odd[countodd++]=arr[i];
		}
	}
	
     System.out.println("even numberes");
	for(int i=0;i<even.length;i++)
	{
		System.out.println(even[i]);
	}
	System.out.println("odd numbers");
	for(int i=0;i<odd.length;i++)
	{
		System.out.println(odd[i]);		
	}

	
   }
}

		
