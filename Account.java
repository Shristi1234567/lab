package Project;

import java.util.Arrays;

public class Account {
int i=0;
private String name;
private String dateOfBirth;
private long mobile;
private long balance;
private String password;
private String tran[]=new String[10];
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public long getBalance() {
	return balance;
}
public void setBalance(long balance) {
	this.balance = balance;
}
public boolean getPassword(String password) {
	if(this.password.equals(password))
		return true;
	else
		return false;	
}
public void setPassword(String password) {
	this.password = password;
}
public String getTran() {
	String st=String.join(" \n", tran);
	return st;
}
public void setTran(String tran) {
	this.tran[i] = tran;
	i++;
}
public Account(String name,String dateOfBirth,long mobile,String password,int bal,String tan)
{
	this.name=name;
	this.dateOfBirth=dateOfBirth;
	this.mobile=mobile;
	this.password=password;
	balance=bal;
	tran[i]=tan;
	System.out.println(tran[i]);
	i++;
}
@Override
public String toString()
{
	return "Account[i=" + i + ", name=" + name + ",dateOfBirth=" + dateOfBirth + ",mobile=" + mobile + ",balance=" + balance + ",password=" + password + ",tran=" + Arrays.deepToString(tran) + "]";
}

}

