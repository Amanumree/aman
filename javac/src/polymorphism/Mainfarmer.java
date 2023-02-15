class Farmer
{
	void grow()
	{
	System.out.println("Grow some yeilds");
	}
}
class Ragi extends Farmer
{
	void grow()
	{
	System.out.println("Ragi crop is grown");
	}
}
class Maize extends Farmer
{
	void grow()
	{
	System.out.println("Maize crop is grown");
	}
}
class Rice extends Farmer
{
	void grow()
	{
	System.out.println("Rice crop is grown");
	}
}
class Rain
{
	static void rainfall(Farmer F)
	{
	F.grow();
	}
}
class Mainfarmer
{
	public static void main(String[] args)
	{
	Ragi R= new Ragi();
	Maize M= new Maize();
	Rice R1= new Rice();
	Rain.rainfall(R);
	Rain.rainfall(M);
	Rain.rainfall(R1);
	}
}
