package lab4;

import edu.ac.banklib.BankUtil;
import edu.ac.banklib.InitialValues;
import edu.ac.banklib.BankInterface;

public class SavingsAccount extends BankAccount {

	private double interestRate = InitialValues.interestRate;

	private double balance;
	// public SavingsAccount(double[] initialdeposit) {
	// }

	// public SavingsAccount() {
	// TODO Auto-generated constructor stub
	// }

	@Override
	public void calculateAndUpdateBalance() {

		balance += balance * (interestRate / 12);

	}

	@Override
	public void deposit(double initialdeposit) {

		balance += initialdeposit;

	}

	@Override
	public double getBalance() {
		return balance;
	}
}
