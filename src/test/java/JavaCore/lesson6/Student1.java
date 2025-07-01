package JavaCore.lesson6;


public class Student1 {

	int zero;
	int one;
	int two;
	int three;
	int four;
	int id;
	String name;
	String surname;
	String course;


	Student1(int a1, int b1) {
		this(a1, b1, 0, 0, 0);
	}


	Student1(int a4, int b4, int c4, int d4, int e4) {
		zero = a4;
		one = b4;
		two = c4;
		three = d4;
		four = e4;
	}

//		Student1(int id, String name, String surname, String course) {
//			this.id = id;
//			this.name = name;
//			this.surname = surname;
//			this.course = course;
//		}
//
//		Student1(String name, String surname) {
//			this.name = name;
//			this.surname = surname;
//		}

//		Student1() {
//		}


//	void summ(int a) {
//		zero = a;
//		System.out.println(a);
//	}


	void summ(int a, int b) {
		zero = a;
		one = b;
		System.out.println(a + b);

	}

	void summ(int a, int b, int c) {
		zero = a;
		one = b;
		two = c;
		System.out.println(a + b + c);
	}

	void summ(int a, int b, int c, int d) {
		zero = a;
		one = b;
		two = c;
		three = d;
		System.out.println(a + b + c + d);
	}

	void summ(int a, int b, int c, int d, int e) {
		zero = a;
		one = b;
		two = c;
		three = d;
		four = e;
		System.out.println(a + b + c + d + e);
	}

	public static void main(String[] args) {
		Student1 student1 = new Student1(1, 10);
		student1.id=1;
		student1.name="Ivan";
		student1.surname="Ivanov";
		student1.course="Ivanovsky";
		System.out.print("ID студента 1: " + student1.id + ", " + "Имя студента 1: " + student1.name+ ", " + "Фамилия студента 1: " + student1.surname+ ", " + "Курс студента 1: " + student1.course+ ", " +" Результат возврата сложения по методу summ из двух чисел: ");
		student1.summ(20, 30);

	}
}


