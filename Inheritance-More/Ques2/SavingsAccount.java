package assignment_inheritance_1;

public class SavingsAccount extends Account{
	private final int minBalance = 500;
	public SavingsAccount(Person accHolder, double balance) {
		super();
		// TODO Auto-generated constructor stub
		if (balance >= minBalance) {
			createAccount(accHolder, balance);
		}
		else {
			System.out.println("Minimum Balance Error. Account not created.");
		}
	}
	
	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount< minBalance) {
			System.out.println("Minimum Balance Error. Cannot withdraw.");
		}
		else {
			setBalance(getBalance()-amount);
		}
		
		getBalance();
	}



	
	
	
}
