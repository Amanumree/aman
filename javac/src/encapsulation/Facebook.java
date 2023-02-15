package Encapsulation;

public class Facebook {
	public static void main(String[] args) 
	{
		Loginpin Lp=new Loginpin();
		System.out.println(Lp.getpin()+ " Old pwd");
		Lp.setpin(8765);
		System.out.println(Lp.getpin()+ " New pwd");	
	}
	}
	class Loginpin
	{
		private int pin=1256;
		public int getpin()
		{
			return pin;
		}
		public void setpin(int pin)
		{
			this.pin =pin;
		}
	}

