package Encapsulation;

public class Atm {
	public static void main(String[] args) 
	{
		Loginpin1 Lg=new Loginpin1();
		System.out.println(Lg.getpin()+ " Old pin");
		Lg.setpin(8904);
		System.out.println(Lg.getpin()+ " New pin");	
	}
	}
	class Loginpin1
	{
		private int pin=7019;
		public int getpin()
		{
			return pin;
		}
		public void setpin(int pin)
		{
			this.pin =pin;
		}
}
