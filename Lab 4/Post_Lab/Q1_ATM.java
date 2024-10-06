import java.util.Scanner;
class Account{
	private int id;
	private double balance;
	static double AnnualInteresetRate;
	//Default constructor with no args
	Account()
	{
		this.id = 0;
		this.balance = 0;
		System.out.println("Acccount Created with inital values 0");
	}
	Account (int Id, double bal)
	{
		this.id = Id;
		this.balance = bal;
		System.out.println("Account Created and your id is : "+this.id);
	}
	boolean setId(int id)
	{
		this.id = id;
		return true;
	}
	boolean setBalance(int amount)
	{
		this.balance = amount;
		return true;
	}
	boolean setAnnualInterestRate(double rate)
	{
		this.AnnualInteresetRate = rate;
		return true;
	}
	//getter
	int getId()
	{
		return this.id;
	}
	double getBalance()
	{
		return this.balance;
	}
	double getAnnualInterest()
	{
		return (((this.AnnualInteresetRate/12)*this.balance)/100);
	}
	double getAnnualInteresetRate()
	{
		return this.AnnualInteresetRate;
	}
	boolean withdraw(double amount)
	{
		if(this.balance>=amount)
		{
			this.balance-=amount;
			return true;
		}
		return false;
	}
	boolean deposit(double amount)
	{
		this.balance+=amount;
		return true;
	}
}

public class Q1_ATM {
	public static void main(String[] args)
	{
		
		String s ="1. Check Balance\n2. Deposit Money\n3. Withdraw Money\n4.Check Interest\n5.Exit";
		int opt;
		int id;
		double balance = 100;
		double rate = 5;
		Scanner sc = new Scanner(System.in);
		
		Account[] a = new Account[10];
		for(int i =0;i<10;i++)
		{
			System.out.println("Enter the id of "+(i+1)+" person: ");
			id = sc.nextInt();
			a[i] = new Account(id,balance);
			a[i].setAnnualInterestRate(rate);
		}
		while(true)
		{
			int valId;
			System.out.println("Enter the id:");
			valId = sc.nextInt();
			for(int i =0;i<10;i++)
			{
				if(a[i].getId() == valId)
				{
					
					while(true)
					{
						System.out.println(s);
						System.out.println("Enter an option to perform: ");
						opt = sc.nextInt();
						if(opt ==1)
						{
							System.out.println("Balance is you account is :"+a[i].getBalance());
						}
						else if(opt ==2)
						{
							double amount;
							System.out.println("Enter the amount to deposit: ");
							amount = sc.nextInt();
							double c = a[i].getBalance();
							System.out.println("Amount Deposited: "+a[i].deposit(amount));
							System.out.println("Amount Before Deposit: "+c+"\nAmount After Deposit: "+a[i].getBalance());
						}
						else if(opt ==3)
						{
							double amount = sc.nextInt();
							double c = a[i].getBalance();
							System.out.println("Amount withdrawed: "+a[i].withdraw(amount));
							System.out.println("Amount Before withdraw: "+c+"\nAmount After Withdraw: "+a[i].getBalance());
						}
						else if(opt ==4)
						{
							System.out.println("Interest of you account balance is :"+a[i].getAnnualInterest());
						}
						else if(opt ==5)
						{
							System.out.println("Thank you");
							break;
						}
						else
						{
							System.out.println("Make a valid choice");
						}
					}
					
				}
				
			}
			
				System.out.println("Enter a valid Id: ");
				valId = sc.nextInt();
			
		}	
	}
}

