package JavaCore.lesson11;

public class Car {
	String color;
	String engine;
	int dorsCount = 2;

	Car(String color, String engine, int dorsCount) {
		this.color = color;
		this.engine = engine;
		this.dorsCount = dorsCount;
	}
}

class CarTest {

	int changedorsCount(Car c, int dorsCount) {
		c.dorsCount = dorsCount;
		System.out.println("Количество дверей, изменённых методом changedorsCount: " + dorsCount);
		return dorsCount;
	}

	public String changedors2Parametres(String color, String engine) {
		return (engine);
	}

	public static void main(String[] args) {
		Car car1 = new Car("Black", "V12", 16);
		System.out.println("Изначальное кол-во дверей в авто: " + car1.dorsCount);

		CarTest ct1 = new CarTest();
		System.out.println("Измененное кол-во дверей через создание объекта в CarTest: " + ct1.changedorsCount(car1, 6));
		System.out.println("Измененное кол-во дверей через создание объекта в CarTest: " + ct1.changedorsCount(car1, 16));

		CarTest ct2 = new CarTest();
		System.out.println("Параметры, изменённые методом changedors2Parametres: " + ct2.changedors2Parametres("Red", "V2"));

	}
}