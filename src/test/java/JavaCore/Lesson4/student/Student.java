package JavaCore.Lesson4.student;

public class Student {
	String name;
	int age;
	double gpa;

	Student() {
		this.name = "Неизвестно";
		this.age = 18;
		this.gpa = 0;
	}

	Student(String name) {
		this.name = name;
	}

	Student(String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	public void displayStudent(String name, int age, double gpa) {
		Student student = new Student();
//		student.name = "Петр";
//		student.age = 22;
//		student.gpa = 4.4;

	}
}

class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);

		Student student2 = new Student();
		student2.displayStudent("Иван", 11, 5);
		Student student3 = new Student();



	}
}