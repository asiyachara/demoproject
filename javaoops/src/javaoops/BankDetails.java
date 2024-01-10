package javaoops;

abstract class BankAccount
{
	private String accountNumber;
	private double balance;
	public BankAccount(String accountNumber,double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	private void setBalance(double balance)
	{
		this.balance=balance;
	}
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
}
class SavingsAccount extends BankAccount
{
	public SavingsAccount(String accountNumber,double balance)
	{
		super(accountNumber,balance);
		
	}
	public void deposit(double amount)
	{
		setBalance(getBalance()+amount);
		System.out.println("deposit of:"+amount+"current balance:"+getBalance());
		
	}
	public void withdraw(double amount)
	{
		if(getbalance>=amount)
		{
			setBalance(getBalance-amount);
		}
	}
}

public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
