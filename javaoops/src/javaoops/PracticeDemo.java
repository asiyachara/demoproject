package javaoops;

 class PracticeDemo1 {
		   private String accountNumber;
		    private double balance;

		    public PracticeDemo1(String accountNumber, double balance) {
		        this.accountNumber = accountNumber;
		        this.balance = balance;
		    }

		    public String getAccountNumber() {
		        return accountNumber;
		    }
		    public double getBalance()
		    {
		    	return balance;

		   
		    }

		    public void deposit(double amount) {
		        balance += amount;
		    }

		    public void withdraw(double amount) {
		        balance -= amount;
		    }
		  }

		  class SavingsAccount11 extends PracticeDemo1 {
		      private double interestRate;

		      double balance=0;
		      public SavingsAccount11(String accountNumber, double balance, double interestRate) {
		          super(accountNumber, balance);
		          this.interestRate = interestRate;
		      }

		      public double getInterestRate() {
		          return interestRate;
		      }

		      public void deposit(double amount) {
		          balance += amount;
		          balance += (amount * interestRate);
		      }

		      public void withdraw(double amount) {
		          balance -= amount;
		      }

			
			
		  }

		  public class PracticeDemo{
			  public static void main(String[] args) {
			        SavingsAccount account1= new SavingsAccount11("123456", 5000, 0.05);
			        System.out.println("Account number: " + account1.getAccountNumber());
			        System.out.println("Balance: " + account1.getBalance());
			        System.out.println("Interest rate: " + account1.getInterestRate());

			        account1.deposit(1000);
			       
			       
			  }
		  }

}
