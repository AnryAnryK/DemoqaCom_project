package patterns.builder;

public class Start {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza.Builder()
				.component1("Сыр")
				.component2("Колбаса")
				.component3("Помидор")
				.component4("Зелень")
				.build();

		System.out.println("Пицца 1, состав : ");
		System.out.println(pizza1.component1);
		System.out.println(pizza1.component2);
		System.out.println(pizza1.component3);
		System.out.println(pizza1.component4);


		System.out.println("======================================================================");

		Pizza pizza2 = new Pizza.Builder()
				.component1("Мидии")
				.component2("Кальмары")
				.component3("Ананас")
				.component4("Брынза")
				.build();

		System.out.println("Пицца 2, состав : ");
		System.out.println(pizza2.component1);
		System.out.println(pizza2.component2);
		System.out.println(pizza2.component3);
		System.out.println(pizza2.component4);
	}
}
