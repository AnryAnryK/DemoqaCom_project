package JavaCore.lesson8;


public class Lesson8z2 {
	static final float pi = 3.14f;
	static float radius;

	void squarescore(float radius) {
		this.radius = radius = 4;
		float square = pi * radius * radius;
		System.out.println(square);
	}

	static void circlescore(float radius) {
		float circle = 2 * pi * radius;
		System.out.println(circle);
	}

	void radiusSquareCircleScore(float radius) {
		float allscore = pi * radius * radius;
		System.out.println(radius);
		System.out.println();
		System.out.println("Размер радиус+площадь+окружность: " + allscore);
		System.out.println("=================");
	}

	public static void main(String[] args) {
		Lesson8z2 ls8z2 = new Lesson8z2();
		System.out.print("Результат подсчёта площади по формуле из метода void squarescore: ");
		ls8z2.squarescore(3);
		System.out.println("=================");
		System.out.println("Показывает радиус: " + radius);
		System.out.println("=================");
		System.out.println("Показывает длину окружности: ");
		ls8z2.radiusSquareCircleScore(2);
		System.out.println("=================");
	}
}
