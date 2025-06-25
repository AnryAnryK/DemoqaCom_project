package JavaCore.Lesson4.employee;

public class Employee {
	String name;
	int position;
	static int employeeCount=0;

	Employee() {
		this.name = name;
		this.position = position;
		this.employeeCount = employeeCount;
	}
	 int EmployeeCount() {
		employeeCount++;

		 return employeeCount++;
	 }

	public void getName() {
		Employee employeeGetName = new Employee();
		employeeGetName.name = name;
		name = "Петр";
	}

	public void setName(String name) {
		this.name = name;
		name = "Слава";
	}

	public void getPosition() {
		Employee employeeGetPosition = new Employee();
		employeeGetPosition.position = position;
		position = 1;

	}

	public void setPosition(int position) {
		this.position = position;
	}

	public static void  getEmployeeCount() {
		System.out.println(employeeCount);
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
//		employee1.setName("Слава");
//		System.out.println("Имя: " + employee1.name);
		employee1.getPosition();
		System.out.println("Номер позиции: " + employee1.position);
		System.out.println(employee1.EmployeeCount());
		employee1.getEmployeeCount();



		System.out.println("=================");

		Employee employee2 = new Employee();
		employee2.getName();
		System.out.println("Имя: " + employee2.name);
		employee2.getPosition();
		System.out.println("Номер позиции: " + employee2.position);
		System.out.println(employee2.EmployeeCount());
		employee2.getEmployeeCount();

		System.out.println("=================");

		System.out.println("Общее количество сотрудников");
		System.out.println(employee1.EmployeeCount() + employee2.EmployeeCount());
//		System.out.println(employee1.getEmployeeCount(), employee2.getEmployeeCount());

	}
}
