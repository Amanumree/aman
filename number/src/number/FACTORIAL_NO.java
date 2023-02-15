package number;
import java.util.Scanner;
public class FACTORIAL_NO {
	public static void main(String[] args) {
		
		Scanner a =new Scanner(System.in);
        System.out.println("enter the no");
         int num  = a.nextInt();
            int fact=1;
            for(int i=num;i>=1;i--)
        { 
           fact = fact*i;
        }
            System.out.println(fact);
}
}