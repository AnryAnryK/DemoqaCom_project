package JavaCore.lesson5Constructor.employee;

public class Employee {
	int id;
	String surname;
	int age;
	float salary;
	String department;


	Employee(int id, String surname, int age, float salary, String department) {
		this.id = id;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	float salaryDouble() {
		salary = salary * 2;
		return salary;
	}
}

class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Иванов", 22, 101f, "FinancialDepartment");
		Employee employee2 = new Employee(2, "Петров", 40, 202f, "TradeDepartment");

		System.out.println("Работнику " + employee1.surname + "(у)" + " увеличили зарплату вдвое, " + " она была " + employee1.salary + " а стала равна: " + employee1.salaryDouble());
		System.out.println("Работнику " + employee2.surname + "(у)" + " увеличили зарплату вдвое, " + " она была " + employee2.salary + " а стала равна: " + employee2.salaryDouble());

	}
}
