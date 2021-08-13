import java.util.*;
class incometax{

public static void main(String args[])
{
double salary,DA,HRA,GROSS,x,y,z;
Scanner scan = new Scanner(System.in);

System.out.println("Enter the basic salary = ");
salary=scan.nextDouble();

	DA=salary-salary*0.2;
	HRA=salary-salary*0.3;
	GROSS=salary+DA+HRA;

if(salary >0 && salary < 4000)
{
	
	System.out.println("Income Tax is applied for "+salary+" is = 4%");
	x=DA-DA*0.04;
	y=HRA-HRA*0.04;
	z=GROSS-GROSS*0.04;
	System.out.println("DA salary is "+DA+"\nDA salary by cutting 4% income tax is "+x);
	System.out.println("HRA salary is "+HRA+"\nHRA salary by cutting 4% income tax is "+y);
	System.out.println("GROSS salary is "+GROSS+"\nGROSS salary by cutting 4% income tax is "+z);
}

else if(salary >=4000 && salary < 10000)
{
	
	System.out.println("Income Tax is applied for "+salary+" is = 6%");
	x=DA-DA*0.06;
	y=HRA-HRA*0.06;
	z=GROSS-GROSS*0.06;
	System.out.println("DA salary is "+DA+"\nDA salary by cutting 6% income tax is "+x);
	System.out.println("HRA salary is "+HRA+"\nHRA salary by cutting 6% income tax is "+y);
	System.out.println("GROSS salary is "+GROSS+"\nGROSS salary by cutting 6% income tax is "+z);
}
else if(salary >=10000 && salary < 17000)
{
	
	System.out.println("Income Tax is applied for "+salary+" is = 8%");
	x=DA-DA*0.08;
	y=HRA-HRA*0.08;
	z=GROSS-GROSS*0.08;
	System.out.println("DA salary is "+DA+"\nDA salary by cutting 8% income tax is "+x);
	System.out.println("HRA salary is "+HRA+"\nHRA salary by cutting 8% income tax is "+y);
	System.out.println("GROSS salary is "+GROSS+"\nGROSS salary by cutting 8% income tax is "+z);
}
else if(salary >=17000 && salary < 27000)
{
	
	System.out.println("Income Tax is applied for "+salary+" is = 10%");
	x=DA-DA*0.1;
	y=HRA-HRA*0.1;
	z=GROSS-GROSS*0.1;
	System.out.println("DA salary is "+DA+"\nDA salary by cutting 10% income tax is "+x);
	System.out.println("HRA salary is "+HRA+"\nHRA salary by cutting 10% income tax is "+y);
	System.out.println("GROSS salary is "+GROSS+"\nGROSS salary by cutting 10% income tax is "+z);
}
else if(salary >=27000 )
{
	
	System.out.println("Income Tax is applied for "+salary+" is = 15%");
	x=DA-DA*1.5;
	y=HRA-HRA*1.5;
	z=GROSS-GROSS*1.5;
	System.out.println("DA salary is "+DA+"\nDA salary by cutting 15% income tax is "+x);
	System.out.println("HRA salary is "+HRA+"\nHRA salary by cutting 15% income tax is "+y);
	System.out.println("GROSS salary is "+GROSS+"\nGROSS salary by cutting 15% income tax is "+z);
}
}
}