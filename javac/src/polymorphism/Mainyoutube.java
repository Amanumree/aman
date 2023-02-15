class Youtube
{
	void watch()
	{
	System.out.println("watch some videos");
	}
}
class Studies extends Youtube
{
	void watch()
	{
	System.out.println("Watch some studies related videos");
	}
}
class Movies extends Youtube
{
	void watch()
	{
	System.out.println("Watch Googly movie");
	}
}
class Technology extends Youtube
{
	void watch()
	{
	System.out.println("Watch videos of technology updated");
	}
}
class User
{
	static void access(Youtube Y)
	{
	Y.watch();
	}
}
class Mainyoutube
{
	 public static void main(String[] args)
	 {
	  Studies S= new Studies();
	  Movies M= new Movies();
	  Technology T= new Technology();
	  User.access(S);
	  User.access(M);
	  User.access(T);
	  }
}