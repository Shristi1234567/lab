package Project;

import java.util.HashMap;
import java.util.Scanner;

public class User {
public static void main(String args[])
{
	HashMap hm=new HashMap();
	while(true)
	{
		System.out.println("***************");
		System.out.println("    Pay Wallet    ");
		System.out.println("*****************");
		System.out.println();
		System.out.println("1.create account\n 2.show balance\n 3.deposit\n 4.withdraw\n 5.fund transfer\n 6.print transaction");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice:");
		int key=sc.nextInt();
		switch(key)
		{
		case 1:
			System.out.println("enter your name");
			String name=sc.next();
			name+=sc.nextLine();
			System.out.println("enter your mobile number");
			long mob=sc.nextLong();
			System.out.println("enter your date of birth as dd/mm/yyyy");
			String date=sc.next();
			System.out.println("enter a password");
			String password=sc.next();
			
			Account ac=new Account(name,date,mob,password,1000,"Account Created Rs.1000 balance");
			long accNo=mob-23456;
			hm.put(accNo, ac);
			System.out.println("Your Account number is successfully created");
			System.out.println("Your Account number is:"+accNo);
			System.out.println("Thankyou");
			break;
			
		case 2:
			System.out.println("enter your account number");
			accNo=sc.nextLong();
			if(hm.containsKey(accNo))
			{
				System.out.println("enter your password");
				password=sc.next();
				Account acco=(Account)hm.get(accNo);
				if(acco.getPassword(password))
				{
					System.out.println("hello "+acco.getName());
					System.out.println("your account balance is "+ acco.getBalance());
				}
				else
				{
					System.out.println("enter valid account number");
					break;
				}
			}
				else
					System.out.println("enter correct account number");
				break;
		case 3:
			System.out.println("enter your account number");
			accNo=sc.nextLong();
			if(hm.containsKey(accNo))
			{
				System.out.println("enter your password");
				password=sc.next();
				Account acco=(Account)hm.get(accNo);
				if(acco.getPassword(password))
				{
					System.out.println("heelo"+acco.getName());
					System.out.println("enter the deposit amount");
					long amt=sc.nextLong();
					System.out.println("your deposit balance is:"+amt);
					System.out.println("pur account balance is"+acco.getBalance());
				}
				else
				{
					System.out.println("enter valid password");
					break;
				}
			}
			else
				System.out.println("enter correct account number");
			break;
		case 4:
			System.out.println("enter your account number");
			accNo=sc.nextLong();
			if(hm.containsKey(accNo))
			{
				System.out.println("enter your password");
				password=sc.next();
				Account acco=(Account)hm.get(accNo);
				if(acco.getPassword(password))
				{
					System.out.println("hello" +acco.getName());
					System.out.println("enter the withdraw amount");
					long amt=sc.nextLong();
					long bal=acco.getBalance()-amt;
					acco.setBalance(bal);
					acco.setTran("amount deposited"+amt);
					System.out.println("your deposited balance is"+amt);
					System.out.println("your account balance is"+acco.getBalance());
				}
				else
				{
					System.out.println("enter valid password");
					break;
				}
			}
			else
				System.out.println("enter correct account number");
			break;
		case 5:
			System.out.println("enter your account number");
			accNo=sc.nextLong();
			if(hm.containsKey(accNo))
			{
				System.out.println("enter your password");
				password=sc.next();
				Account acco=(Account)hm.get(accNo);
				if(acco.getPassword(password))
				{
					System.out.println("hello" +acco.getName());
					System.out.println("enter the account in which you want to transfer");
					long accNo1=sc.nextLong();
					if(hm.containsKey(accNo1))
					{
						Account acco1=(Account)hm.get(accNo1);
						System.out.println("enter the amount");
						long amt=sc.nextLong();
						long bal=acco1.getBalance()+amt;
						acco1.setBalance(bal);
						bal=acco.getBalance()+amt;
						acco.setTran("amount deposited to account "+ accNo1 + "at amount "+amt);
						System.out.println("your account balance is"+acco.getBalance());
					}
				else
				{
					System.out.println("enter valid account number");
					break;
				}
			}
				else
				{
						System.out.println("enter valid password");
						break;
			}
		}
				else
						System.out.println("enter correct account number");
				break;
				case 6:
					System.out.println("enter your account number");
					accNo=sc.nextLong();
					if(hm.containsKey(accNo))
					{
						System.out.println("enter your password");
						password=sc.next();
						Account acco=(Account)hm.get(accNo);
						if(acco.getPassword(password))
						{
							System.out.println("your transcation are"+acco.getTran());
						}
						else
						{
							System.out.println("enter correct password");
							break;
						}
					}
					else
						System.out.println("enter correct account number");
					break;
				case 7:
					System.exit(0);
				default:
					System.out.println("enter proper choice");
					break;
					
		
	}
}
}
}