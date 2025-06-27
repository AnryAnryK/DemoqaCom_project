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


		Student1(int a0) {
			zero = a0;
		}

		Student1(int a1, int b1) {
			this(a1);
			one = b1;
		}

		Student1(int a2, int b2, int c2) {
			this(a2, b2);
			two = c2;
		}

		Student1(int a3, int b3, int c3, int d3) {
			this(a3, b3, c3);
			three = d3;
		}

		Student1(int a4, int b4, int c4, int d4, int e4) {
			this(a4, b4, c4, d4);
			four = e4;
		}

		Student1(int id, String name, String surname, String course) {
			this.id = id;
			this.name = name;
			this.surname = surname;
			this.course = course;
		}

		Student1(String name, String surname) {
			this.name = name;
			this.surname = surname;
		}

		Student1() {
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

	public static void main(String[] args) {
		Student1 student1 = new Student1();

	}
	}

