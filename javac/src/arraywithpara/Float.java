package Arraywithparameter;

public class Float {
static void cool(float[] fll)
{
	for(int i=0; i<fll.length; i++)
	{
		System.out.println(fll[i]);
	}
}
public static void main(String[] args) {
	float[] faa={10.25f,15.20f, 20.50f};
	cool(faa);
}
}
