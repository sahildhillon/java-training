package assignment_inheritance_1;

public class CurrentAccount extends Account{
	private double overDraftLimit;
	
	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	public CurrentAccount(Person accHolder, double balance,double overDraftLimit) {
		super();
		createAccount(accHolder, balance);
		setOverDraftLimit(overDraftLimit);
	}
	
	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount< overDraftLimit) {
			System.out.println("Out off Limit. Invalid Transaction");
		}
		else {
			setBalance(getBalance()-amount);
		}
		getBalance();
	}
}
