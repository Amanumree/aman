class Amazon
{
	void order()
	{
	System.out.println("Order some products");
	}
}
class Grocery extends Amazon
{
	void order()
	{
	System.out.println("Order Grocery products");
	}
}
class Footwear extends Amazon
{
	void order()
	{
	System.out.println("Order footwear");
	}
}
class Electronics extends Amazon
{
	void order()
	{
	System.out.println("Order mobile phone");
	}
}
class Customer
{
	static void buy(Amazon A)
	{
	A.order();
	}
}
class Mainamazon
{
	public static void main(String[] args)
	{
	Grocery G= new Grocery();
	Footwear F= new Footwear();
	Electronics E= new Electronics();
	Customer.buy(G);
	Customer.buy(F);
	Customer.buy(E);
	}
}
