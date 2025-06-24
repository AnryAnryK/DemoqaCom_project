package JavaCore.Lesson5Constructor;

public class BankAccount {
	double balance = 1.0;
	double balancePlus = balance + 2.1;


	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.popolnenieShveta(bankAccount.balance, bankAccount.balancePlus);
	}


	double popolnenieShveta(double balance, double balancePlus) {

		double upbalance = balance + balancePlus;
		System.out.println(upbalance);
		return upbalance;


	}
}
