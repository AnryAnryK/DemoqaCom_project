package JavaCore.Lesson4.employee;

public class Employee {
	String name;
	int position;
	static int employeeCount;

	Employee() {
		this.name = name;
		this.position = position;
		employeeCount = getEmployeeCount() + 1;
	}

	public void getName() {
		Employee employeeGetName = new Employee();
		employeeGetName.name = name;
		name = "Петр";
	}

	public void setName(String name) {
		this.name = name;
		name="Слава";
	}

	public void getPosition() {
		Employee employeeGetPosition = new Employee();
		employeeGetPosition.position = position;
		position = 1;

	}

	public void setPosition(int position) {
		this.position = position;
	}

	public static int getEmployeeCount() {
		return employeeCount;
	}

	public static void setEmployeeCount(int employeeCount) {
		Employee.employeeCount = employeeCount;

	}


}

class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.getName();
		System.out.println("Имя: " + employee1.name);
		employee1.setName("Слава");
		System.out.println("Имя: " + employee1.name);
		employee1.getPosition();
		System.out.println("Номер позиции: " + employee1.position);


		System.out.println("=================");

		Employee employee2 = new Employee();
		employee2.getName();
		System.out.println("Имя: " + employee2.name);
		employee2.getPosition();
		System.out.println("Номер позиции: " + employee2.position);


		System.out.println("=================");

		System.out.println("Общее количество сотрудников");
	}
}
