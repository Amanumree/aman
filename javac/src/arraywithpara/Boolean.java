package Arraywithparameter;

public class Boolean {
static void disp(boolean[] boo)
{
	for(int i=0; i<boo.length; i++)
	{
		System.out.println(boo[i]);
	}
}
public static void main(String[] args) {
	boolean[] bll={true, false, false, true};
	disp(bll);
	
}
}
