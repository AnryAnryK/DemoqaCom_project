package JavaCore.lesson6;

public class Student {
	int zero;
	int one;
	int two;
	int three;
	int four;
	int id;
	String name;
	String surname;
	String course;


	Student(int a0) {
		zero = a0;
	}

	Student(int a1, int b1) {
		this(a1);
		zero = a1;
		one = b1;
	}


	Student(int a2, int b2, int c2) {
		this(a2, b2);
		zero = a2;
		one = b2;
		two = c2;
	}


	Student(int a3, int b3, int c3, int d3) {
		this(a3, b3, c3);
		zero = a3;
		one = b3;
		two = c3;
		three = d3;
	}


	Student(int a4, int b4, int c4, int d4, int e4) {
		this(a4, b4, c4, d4);
		zero = a4;
		one = b4;
		two = c4;
		three = d4;
		four = e4;
	}

	Student(int id, String name, String surname, String course) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.course = course;
	}

	Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	Student() {

	}


	void summ(int a) {
		zero = a;
		System.out.println(a);
	}

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
}


class StudentTest {
	public static void main(String[] args) {

		Student student1 = new Student(0); // вывод на экран с использованием метода summ
		student1.summ(0, 1);
		student1.summ(0, 1, 2);
		student1.summ(0, 1, 2, 3);
		student1.summ(0, 1, 2, 3, 4);

//Student student1 = new Student(); // вывод на экран с использованием дефолтного конструктора
//		student1.summ(0);
//		student1.summ(0, 1);
//		student1.summ(0, 1, 2);
//		student1.summ(0, 1, 2, 3);
//		student1.summ(0, 1, 2, 3, 4);

		System.out.println("==============");

		Student student2 = new Student();
		student2.id = 1;
		student2.name = "Bro";
		student2.surname = "BroBrovsky";
		student2.course = "IT";
		System.out.println("Объект Конструктора с пустыми данными: id =" + student2.id + " имя: " + student2.name + " фамилия: " + student2.surname + " курс: " + student2.course);

		System.out.println("==============");

		Student student3 = new Student("Студент", "Студентович");
		System.out.println("Объект Конструктора с полями name и surname " + "имя: " + student3.name + " фамилия: " + student3.surname);

		System.out.println("==============");

		Student student4 = new Student(2, "Кто-то", "Кто-тович", "КУ");
		System.out.println("Объект Конструктора со всеми полями: id =" + student4.id + " имя: " + student4.name + " фамилия: " + student4.surname + " курс: " + student4.course);

	}
}