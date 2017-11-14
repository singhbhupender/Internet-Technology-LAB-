import java.util.Scanner;

//****************** CLASS INSUFF_BAL FOR HANDLE USER DEFINED EXCEPTION *********

class Insuff_bal extends RuntimeException
{

//################# CONSTRUCTOR INSUFF_BAL ###################

	public Insuff_bal(String S)
	{
		System.out.print(S);
	}
}

//****************** CLASS BANK ACCOUNT ******************

class Bank_Account
{
	enum Gender {Male, Female}; 
	private long ac;
	private double bal;
	private String name;
	private Gender G;
	private final int taxrate; 

//################# CONSTRUCTOR INSUFF_BAL ###################
	
	public Bank_Account()
	{
		ac=0;
		bal=0.0;
		name=new String();
		G=null;
		taxrate=10;
	}

//################# FUNCTION INPUT ###################	
	
	public void input()
	{
		String G1=new String();
		Scanner S=new Scanner(System.in);
		System.out.print("\nEnter the name\n");
		name=S.nextLine();
		System.out.print("\nEnter the Gender (M/F)\n");
		G1=S.nextLine();
		System.out.print("\nEnter the account no.\n");
		ac=S.nextLong();
		System.out.print("\nEnter the Balance\n");
		bal=S.nextDouble();
		if(G1.equals("M"))
			G=Gender.Male;
		else
			G=Gender.Female;
				
	}

//################# FUNCTION DISPLAY ###################

	public void display()
	{
		System.out.print("Account no. - "+ac+"\n");
		System.out.print("Balance - "+bal+"\n");
		System.out.print("name - "+name+"\n");
		System.out.print("Gender - "+G+"\n");	
	}

//################# FUNCTION DEPOSIT ###################

	public void deposit(double b)
	{
		bal+=b;
	}

//################# FUNCTION WITHDRAW ###################

	public void withdraw(double b)
	{
		try
		{
			if(b>bal)
				throw new Insuff_bal("INSUFFICIENT BALANCE    ");
			bal-=b;
		}
		catch(Insuff_bal e)
		{
			System.out.print(e+" Exception \n");
		}
	}

//################# FUNCTION GETBALANCE ###################

	public double getBalance()
	{
		return bal;
	}

//################# FUNCTION TAX DEDUCTION ###################

	public void taxDeduction()
	{
		bal=bal-(0.1*bal);
	}
}


//****************** CLASS BANK TEST (MAIN FUNCTION)*********

public class Q3Banktest
{

//################# MAIN FUNCTION ###################

	public static void main(String args[])
	{
		int c,rs=1,flag=0;
		double b;
		Bank_Account B=new Bank_Account();
		Scanner s1=new Scanner(System.in);
		while(rs==1)
		{
			System.out.println("\n	*****	MENU 	*****");
   			System.out.println("\n1.INPUT DATA");
			System.out.println("\n2.DISPLAY");
			System.out.println("\n3.DEPOSIT");
			System.out.println("\n4.WITHDRAW");
			System.out.println("\n5.GET BALANCE");
			System.out.println("\n6.TAX DEDUCTION");
			System.out.println("\n7.EXIT");
			System.out.println("\nENTER YOUR CHOICE ::  "); 
			c=s1.nextInt();
			switch(c)
			{	
				case 1:	B.input();
				       	break;
				case 2:	B.display();
				       	break;
				case 3:	System.out.print("Enter the amount for deposit \n");
					b=s1.nextDouble();
					B.deposit(b);
				       	break;
				case 4:	System.out.print("Enter the amount for withdraw \n");
					b=s1.nextDouble();
					B.withdraw(b);
				       	break;
				case 5:	System.out.print("UR BALANCE IS \n"+B.getBalance());
				       	break;
				case 6:	B.taxDeduction();
					System.out.print("UR tax has been Deducted, Plz execute option 5 to view ur balance");
				       	break;
				case 7:	flag=1;
					break;
			}
			if(flag==1)
			{
				System.out.print("\n\n\nTHANX FOR USING OUR PROGRAM,HAVA A NICE DAY\n\n\n");
				flag=0;
				break;
			}
		}	
	}
}