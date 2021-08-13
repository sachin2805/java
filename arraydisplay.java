import java.util.*;
class arraydisplay{
public static void main(String args[])
{
	int n,a[]=new int[10],i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the count = ");
	n=s.nextInt();
	System.out.println("Enter the numbers = ");

	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("the values present in array are = ");
	for(i=0;i<n;i++)
	{
		System.out.println(+a[i]);
	}

}
}
/*OUTPUT
F:\java>javac arraydisplay.java

F:\java>java arraydisplay
Enter the count =
5
Enter the numbers =
10
20
30
40
50
the values present in array are =
10
20
30
40
50

F:\java>
*/

