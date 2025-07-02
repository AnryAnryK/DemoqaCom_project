package JavaCore.lesson8;


public class Student {
	int a;
	int b;
	int c;
	int score;

	static int multiplication(int a, int b, int c) {
		int score = a * b * c;
		return score;
	}

	static void division(int a, int b) {
		int score = a / b;
		System.out.println(score);
	}

	public static void main(String[] args) {
		System.out.println("Отображает значение из статического метода multiplication (умножение трёх чисел): " + Student.multiplication(1, 2, 3));
		System.out.print("Отображает значение из статического метода division (деление первых двух чисел): "); Student.division(1, 2);

	}
}

class Student1 {
	int a1;
	int b1;
	int c1;
	int score1;
}
