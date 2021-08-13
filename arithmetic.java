import java.util.*;

public class arithmetic{
 	public static void main(String args[])
	{
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any two values = ");
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println("The addition of "+a+" and "+b+" is  = "+(a+b));
		System.out.println("The substraction of "+a+" and "+b+" is  = "+(a-b));
		System.out.println("The division of "+a+" and "+b+" is  = "+(a/b));
		System.out.println("The multiplication of "+a+" and "+b+" is  = "+(a*b));

	}
}
	
/*OUTPUT
F:\java>javac arithmetic.java

F:\java>java arithmetic
Enter any two values =
20
10
The addition of 20 and 10 is  = 30
The substraction of 20 and 10 is  = 10
The division of 20 and 10 is  = 2
The multiplication of 20 and 10 is  = 200

F:\java>
*/	