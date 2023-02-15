package Arraywithreturntype;

public class Short {
	static short[] disp()
	{
		short[] ass={5,7,8,9};
		return ass;
	}
	public static void main(String[] args) {
		short[] y= disp();
		for(int i=0; i<y.length; i++)
		{
			System.out.println(y[i]);
		}
	}
	}

