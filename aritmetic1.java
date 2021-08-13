import java.util.*;

public class arithmetic1{
 	public static void main(String args[])
	{
		double a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any two values = ");
		a=scan.nextDouble();
		b=scan.nextDouble();
		
		System.out.println("The addition of "+a+" and "+b+" is  = "+(a+b));
		System.out.println("The substraction of "+a+" and "+b+" is  = "+(a-b));
		System.out.println("The division of "+a+" and "+b+" is  = "+(a/b));
		System.out.println("The multiplication of "+a+" and "+b+" is  = "+(a*b));

	}
}




