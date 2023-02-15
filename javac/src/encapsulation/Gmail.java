package Encapsulation;

public class Gmail 
{
public static void main(String[] args) 
{
	Loginmail Lm=new Loginmail();
	System.out.println(Lm.getpwd()+ " Old pwd");
	Lm.setpwd(7722);
	System.out.println(Lm.getpwd()+ " New pwd");	
}
}
class Loginmail
{
	private int pwd=4477;
	public int getpwd()
	{
		return pwd;
	}
	public void setpwd(int pwd)
	{
		this.pwd =pwd;
	}
}
