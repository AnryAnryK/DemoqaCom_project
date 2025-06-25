package JavaCore.Lesson4.student;

public class Student {
	String name;
	int age;
	int gpa;

	Student() {
		this.name = "Неизвестно ";
		this.age = 18;
		this.gpa = 0;
	}

	Student(String name) {
		this.name = name;
	}

	Student(String name, int age, int gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}


	public void displayStudent1() {
		Student studentDisplay1 = new Student();
		System.out.println("studentDisplay1: " + "Имя по-умолчанию должно быть Неизвестно =" + name + ";" + " Возраст по-умолчанию  должен быть 18 =" + age + ";" + " Средняя оценка по-умолчанию  должна быть 0 =" + gpa);
	}


	public void displayStudent2(String name) {
		Student studentDisplay2 = new Student();
		studentDisplay2.name = name;
		name = "Петр";
		System.out.println("studentDisplay2.name: " + " Имя из Конструктора, где только Имя, должно быть Петр =" + name);
	}


	public void displayStudent3(String name, int age, int gpa) {
		Student studentDisplay3 = new Student();
		studentDisplay3.name = name;
		name = "Вася";
		studentDisplay3.age = age;
		age = 22;
		studentDisplay3.gpa = gpa;
		gpa = 4;
		System.out.println("studentDisplay3: " + "Имя из Конструктора, где все параметры, должно быть Вася =" + name + ";" + " Возраст из Конструктора, где все параметры, должен быть 22 =" + age + ";" + " Средняя оценка  из Конструктора, где все параметры,  должна быть 4 =" + gpa);
	}
}


class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println(" 1 ");
		student1.displayStudent1();

		System.out.println(" 2 ");
		Student student2 = new Student();
		student2.displayStudent2(student2.name);

		System.out.println(" 3 ");
		Student student3 = new Student();
		student3.displayStudent3(student3.name, student3.age, student3.gpa);
	}
}