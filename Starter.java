package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Starter {
public static void main(String args[])
{
	//Account acc=new Account("");
	LoginService ls=new LoginService();
	boolean list=new ArrayList() != null;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the username");
	String name=s.nextLine();
	System.out.println("enter the password");
	String password=s.nextLine();
	System.out.println("enter the account number");
	long acno=s.nextLong();
	Account acc=new Account(name,acno,0);
			
	list=ls.getCheck(name,password);
	
	if(list==true)
	{
	while(true)
	{
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Total Balance");
		System.out.println("4.Funds Transfer");
		System.out.println("5.Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter the amount to be deposited");
			double d=sc.nextDouble();
			 acc.deposit(d);
			break;
		case 2:
			System.out.println("enter the amount to be withdraw");
			double w=sc.nextDouble();
			acc.withdraw(w);
			break;
		case 3:
			System.out.println("total balance");
			acc.getBalance();
			break;
		case 4:
			System.out.println("enter the amount to be transfer");
			double tr=sc.nextDouble();
			System.out.println("enter the username to whom to transfer the funds");
			String uname=sc.next();
			System.out.println("enter the account number");
			long accountno=sc.nextLong();
			acc.transfer(uname,accountno,tr);
			break;
		case 5:
			System.exit(0);
		default:
				System.out.println("Invalid Input");
		}
	}
	}
	else
	{
		Scanner scc=new Scanner(System.in);
		System.out.println("enter the username");
		String n=scc.next();
		System.out.println("enter the password");
		String p=scc.next();
		System.out.println("enter the account number");
		long acc1=scc.nextLong();
	}
	
}
}
