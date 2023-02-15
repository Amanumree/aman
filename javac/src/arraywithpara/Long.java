package Arraywithparameter;

public class Long {
static void test(long[] lgg)
{
	for(int i=0; i<lgg.length; i++)
	{
		System.out.println(lgg[i]);
	}
}
public static void main(String[] args) {
	long[] lnn={10,12,14,16};
	test(lnn);
}
}
