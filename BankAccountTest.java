package lab4;

import java.lang.reflect.Array;
import java.util.Random;

import edu.ac.banklib.BankUtil;
import edu.ac.banklib.InitialValues;
import edu.ac.banklib.BankInterface;

public class BankAccountTest {
	private BankAccount bankAccount[];

	public BankAccountTest() {
		bankAccount = new BankAccount[30];

		for (int i = 0; i < 15; i++) {
			bankAccount[i] = new ChequingAccount();

			bankAccount[i].deposit(InitialValues.initialDeposit[i]);
		}
		for (int i = 15; i < 30; i++) {

			bankAccount[i] = new SavingsAccount();
			bankAccount[i].deposit(InitialValues.initialDeposit[i]);
			;
		}
	}

	public void monthlyProcess(BankAccount array[]) {
		for (int i = 0; i < bankAccount.length; i++) {
			array[i].calculateAndUpdateBalance();

		}

	}

	public void printBalance() {
		for (int i = 0; i < bankAccount.length; i++) {
			BankUtil.printBalance(bankAccount[i].getClass().getName(), (i + 1), bankAccount[i].getBalance());
		}
	}

	public static void main(String[] args) {
		BankAccountTest test = new BankAccountTest();
		for (int i = 0; i < 12; i++) {
			System.out.println("\nMonth " + (i + 1) + "\n");

			test.monthlyProcess(test.bankAccount);
			test.printBalance();

		}
	}
}
