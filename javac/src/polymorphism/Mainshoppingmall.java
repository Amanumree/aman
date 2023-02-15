class Shoppingmall
{
	void shopping()
	{
	System.out.println("Shopping some products");
	}
}
class Clothes extends Shoppingmall
{
	void shopping()
	{
	System.out.println("Shopping some dresses");
	}
}
class Food extends Shoppingmall
{
	void shopping()
	{
	System.out.println("Shopping some Food to eat");
	}
}
class Movie extends Shoppingmall
{
	void shopping()
	{
	System.out.println("Watching KGF2 movie in mall");
	}
}
class Customer
{
	static void purchase(Shoppingmall S)
	{
	S.shopping();
	}
}
class Mainshoppingmall
{
	public static void main(String[] args)
	{
	Clothes C= new Clothes();
	Food F= new Food();
	Movie M= new Movie();
	Customer.purchase(C);
	Customer.purchase(F);
	Customer.purchase(M);
	}
}
