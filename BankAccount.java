package lab4;

public abstract class BankAccount implements edu.ac.banklib.BankInterface {

	protected double balance;

	public void deposit(double initial){
		
	}
	public double getBalance() {
		return balance;

	}

	public abstract void calculateAndUpdateBalance();
}