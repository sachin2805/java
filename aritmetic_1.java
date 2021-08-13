import java.util.*;
class arithmetic_1
{
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
/*OUTPUT
F:\java>javac aritmetic_1.java

F:\java>java arithmetic_1
Enter any two values =
20
10
The addition of 20.0 and 10.0 is  = 30.0
The substraction of 20.0 and 10.0 is  = 10.0
The division of 20.0 and 10.0 is  = 2.0
The multiplication of 20.0 and 10.0 is  = 200.0

F:\java>
*/