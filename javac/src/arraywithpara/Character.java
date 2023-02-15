package Arraywithparameter;

public class Character {
	static void disp(char[] aii)
	{
		for(int i=0; i<aii.length; i++)
		{
			System.out.println(aii[i]);
		}
	}
public static void main(String[] args) {
	char[] acc= {'A', 'B','C','D'};
	disp(acc);
}
}
