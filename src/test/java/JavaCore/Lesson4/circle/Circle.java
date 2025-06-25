package JavaCore.Lesson4.circle;

public class Circle {
	int radius;


	public Circle() {
		this.radius = radius;
	}

	void calculateArea(int radius) {
		Circle circleCalculate = new Circle();
		System.out.println("calculateArea, т.е. в приданное Радуису значение в методе Мейн умножаем на 2 = фактическое значение, а именно ==" + radius * 2);
	}


	void calculateCircumference(int radius) {
		Circle calculateCircumference = new Circle();
		System.out.println("calculateCircumference,  т.е. в приданное Радуису значение в методе Мейн умножаем на 2 и далее умножаем результат на 3 = фактическое значение, а именно ==" + radius * 2 * 3);
	}
}

class CircleTest {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		System.out.println(" 1 ");
		circle1.calculateArea(6);
		System.out.println("В приданном значении  _ circle1.calculateArea(6)  значение (6) * на 2  верным будет = 12");

		System.out.println(" 2 ");

		Circle circle2 = new Circle();
		circle2.calculateCircumference(10);
		System.out.println("В приданном значении  _ circle2.calculateCircumference(10)  значение (10) * на 2 и далее * 3 верным будет  = 60");

	}
}
