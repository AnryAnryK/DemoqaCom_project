package JavaCore.lesson4.employee;

public class Employee {
	String name;
	int position;
	static int employeeCount;

	Employee() {
		this.name = name;
		this.position = position;
		employeeCount=getEmployeeCount()+1;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {

		this.position = position;
	}

	public static int getEmployeeCount() {
		return employeeCount;
	}

	public static void setEmployeeCount(int employeeCount) {

	}
}

class EmployeeTest {
	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setName("Иван");
		System.out.println("Имя сотрудника: " + employee1.getName());
		employee1.setPosition(1);
		System.out.println("Номер позиции сотрудника: " + employee1.getPosition());


		System.out.println("===============");
		Employee employee2 = new Employee();
		employee2.setName("Петр");
		System.out.println("Имя сотрудника: " + employee2.getName());
		employee2.setPosition(2);
		System.out.println("Номер позиции сотрудника: " + employee2.getPosition());

		System.out.println("===============");
		Employee employee3 = new Employee();
		employee3.setName("Боб");
		System.out.println("Имя сотрудника: " + employee3.getName());
		employee3.setPosition(3);
		System.out.println("Номер позиции сотрудника: " + employee3.getPosition());


		System.out.println("===============");
		System.out.println("Общее количество сотрудников: " + Employee.getEmployeeCount());

	}
}
