package number;

public class without_3variable {
public static void main(String[] args) {
	int a=44;
	int b=11;
	System.out.println("a--->"+a+" "+"b--->"+b+"before swapping");
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a--->"+a+" "+"b--->"+b+"after swapping");
}
}
