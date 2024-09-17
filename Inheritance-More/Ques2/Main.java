package assignment_inheritance_1;

public class Main {
	public static void main(String[] args) {
		//	1
		Account ac1 = new Account(new Person("Smith"),2000);
		Account ac2 = new Account(new Person("Kathy"), 3000);
		
		ac1.deposit(2000);
		ac2.withdraw(2000);
		
		System.out.println(ac1.getBalance());
		
		System.out.println(ac2.getBalance());
		
		Account ac3 = new Account(new Person("Raghav"), 400);
		ac3.getBalance();
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		SavingsAccount sac1 = new SavingsAccount(new Person("Sahil",21), 70000);
		sac1.withdraw(1000);
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		CurrentAccount cac1 = new CurrentAccount(new Person("Sahil",21), 80000,-20000);
		sac1.withdraw(89000);
		System.out.println(cac1.getBalance());
	}
}
