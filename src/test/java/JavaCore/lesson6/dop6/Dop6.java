package JavaCore.lesson6.dop6;

public class Dop6 {

	int increaseNumber(int x) {
		x = x * 10;
		return x;
	}

	public static void main(String[] args) {
		Dop6 dop6 = new Dop6();
		System.out.println(dop6.increaseNumber(5));
	}
}
