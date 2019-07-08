package Project;

public class Account
{
	private String name;
	private long acctno;
	private double balance;
	public Account(String owner,long account,double initial)
	{
		name=owner;
		acctno=account;
		balance=initial;
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("total balance="+balance);
	}
	public void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance=balance-amount;
			System.out.println("balance after withdraw="+balance);
		}
		else
		{
			System.out.println("not enough balance");
		}
	}
	public void getBalance()
	{
		System.out.println("total balance="+balance);
	}
	public void transfer(String name,long accountno,double amount)
	{
		if(balance<0)
		{
			System.out.println("no balance");
		}
		else if(balance<amount)
		{
			System.out.println("not enough amount");
		}
		else
		{
			balance=balance-amount;
			System.out.println("after transfer the amount is="+balance);
		}
	}
}

