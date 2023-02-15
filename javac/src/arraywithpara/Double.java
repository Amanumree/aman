package Arraywithparameter;

public class Double {
static void test(double[] drr)
{
	for(int i=0; i<drr.length; i++)
	{
		System.out.println(drr[i]);
	}
}
public static void main(String[] args) {
	double[] doo={10.25, 20.30, 10.50};
	test(doo);
}
}
