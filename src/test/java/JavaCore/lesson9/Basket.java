package JavaCore.lesson9;

public class Basket {

	String banana;
	String apple;
	String pinapple;
	String plum;
	String strawberry;
	String wildberry;
	String mango;
	String melon;

	Basket(String banana){
		this.banana=banana;
	}

	Basket(String banana,  String apple){
		this.banana=banana;
		this.apple=apple;
	}

Basket(String banana, String apple, String pinapple, String plum, String strawberry, String wildberry, String mango, String melon){
	this.banana=banana;
	this.apple=apple;
	this.pinapple=pinapple;
	this.plum=plum;
	this.strawberry=strawberry;
	this.wildberry=wildberry;
	this.mango=mango;
	this.melon=melon;
}

	public static void main(String[] args) {
		Basket basket1 = new Basket(null);
		System.out.println("Содержание 1-й корзины (null): " + basket1.banana);

		Basket basket2 = new Basket(null,null);
		System.out.println("Содержание 1-й корзины (null): " + basket2.banana);


	}
}
