package JavaCore.Lesson5Constructor;

public class BankAccount {
	float balance;


	public static void main(String[] args) {
		BankAccount bankAccount1 = new BankAccount(5.1f);  // неверно считает
		System.out.println("Баланс счёта равен: " + bankAccount1.balance);

		System.out.println("===================");
		float balancePlus = bankAccount1.balance + bankAccount1.popolnenieScheta(3.3f);
		System.out.println("Сумма баланса пополнилась на +" + bankAccount1.popolnenieScheta(3.3f) + " и составляет: " + balancePlus);

		BankAccount bankAccount2 = new BankAccount(balancePlus);
		System.out.println("===================");
		float balanceMinus = balancePlus + bankAccount2.snyaieSoScheta(- 2.3f);
		System.out.println("Сумма баланса " + balancePlus + " уменьшилась на " + bankAccount2.snyaieSoScheta(- 2.3f) + " и составляет: " + balanceMinus);
	}

	BankAccount(float balance) {
		this.balance = balance;
	}

	float popolnenieScheta(float upperbalance) {
		this.balance = upperbalance;
		return balance;
	}

	float snyaieSoScheta(float lowerbalance) {
		this.balance = lowerbalance;
		return balance;
	}
}
