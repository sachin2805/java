/*Write an Account class with default constructor, parameterised constructor and 
methods toString(), deposit(int amt), withdraw(int amt). withdraw method should take care 
of insufficient balance. Accept the values from the user..Display the details of various 
Accounts*/
import java.util.*;
class account
	{
	
	String name;
        double bal;
        int n,d,i;  
        double dep;
       Scanner s= new Scanner(System.in);
       account(){
	System.out.println("----For default constructor----");
       	System.out.println("Enter name of member :");
	        name=s.next();
             System.out.println("Enter balance : ");
              bal= s.nextDouble();
           
       }
	account(String n1,double b1) 
	{
	System.out.println("----For parameterised constructor----");
	name=n1;
	bal=b1;
	deposit();
	 withdraw();
	  display();
	}
         
        	 
        	 void deposit(){         
        	System.out.println("Enter deposite ammount :");
 	        dep=s.nextInt();
                    bal=bal+dep;
                    System.out.println("Balence is :"+bal);
        }
        void withdraw()
        {
            double with;
            System.out.println("....................................................");
            System.out.println("\nEnter the Withdraw Ammount  = ");
                with=s.nextInt();
                if(with<=bal)
                bal=bal-with;
                else
                {
                	System.out.println("Insufficient balence");
                	System.out.println("Plz try again !!!  ");
                withdraw();
                }
            }
        
        void display()
        {
        	System.out.println("Amount withdraw Successfully");
        	System.out.println("\tNmae : "+name+"\n\tAvailable balence : "+bal);
        	System.out.println("......................................................");

        }




	public static void main(String arg[]){
	   account ba=new account();
	    ba.deposit();
	    ba.withdraw();
	    ba.display();
	    account ba2=new account("Sachin",50000);
  	 
	}
}

/*OUTPUT
F:\java>javac account.java

F:\java>java account
----For default constructor----
Enter name of member :
Dev
Enter balance :
12000
Enter deposite ammount :
3000
Balence is :15000.0
....................................................

Enter the Withdraw Ammount  =
5000
Amount withdraw Successfully
        Nmae : Dev
        Available balence : 10000.0
......................................................
----For parameterised constructor----
Enter deposite ammount :
5000
Balence is :55000.0
....................................................

Enter the Withdraw Ammount  =
60000
Insufficient balence
Plz try again !!!
....................................................

Enter the Withdraw Ammount  =
15000
Amount withdraw Successfully
        Nmae : Sachin
        Available balence : 40000.0
......................................................

F:\java>
*/