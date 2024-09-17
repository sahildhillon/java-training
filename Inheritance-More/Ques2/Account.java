package assignment_inheritance_1;
//import java.util
import java.util.Random;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	
	public Account() {
	}
	
	public Account(Person accHolder,double balance) {
		createAccount(accHolder, balance);		
	}
	
//	public void createAccount()
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println(amount+" Rs. credited to Account Number: "+accNum);
	}
	
	public void withdraw(double amount) {
		balance-=amount;
		System.out.println(amount+" Rs. debited from Account Number: "+accNum);
	}
	
	public double getBalance() {
//		System.out.println("Balance for account number "+ accNum+ " is: "+balance);
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void createAccount(Person accHolder, double balance) {
		long x = 1000000L;
		long y = 9999999L;
		Random r = new Random();
		this.accNum = x+((long)(r.nextDouble()*(y-x)));
		this.balance = balance;
		this.accHolder = accHolder;
		
		System.out.println("New Account created for: "+accHolder.getName());
		System.out.println("Account Number: "+ accNum);
		System.out.println("Balance: "+balance);
		System.out.println("---------------------------------");
	}
	
	
	
	
}
