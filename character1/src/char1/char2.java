package char1;

public class char2 {
	public static void main(String[]args)
	{
		char ch = 'A';
		char ch1 ='a';
		char ch2 ='Z';
		for(int i=1;i<=26;i++)
		{
			System.out.println(ch+""+ch1+""+ch2);
			  ch++;
			  ch1++;
			  ch2--;
		}
	}

}
