package Arraywithparameter;

public class Byte {
static void disp(byte[] akk)
{
	for(int i=0; i<akk.length; i++)
	{
		System.out.println(akk[i]);
	}
}
public static void main(String[] args) {
	byte[] a={5,10,15,20};
	disp(a);
}
}
