package lab4;

import edu.ac.banklib.InitialValues;

public class ChequingAccount extends BankAccount {

	private double fee = InitialValues.feePerMonth;
	private double balance;

	// public ChequingAccount(double[] initialdeposit) {

	// }

	@Override
	public void calculateAndUpdateBalance() {
		// TODO Auto-generated method stub
		balance -= fee;
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
