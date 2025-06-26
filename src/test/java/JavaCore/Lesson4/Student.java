package JavaCore.Lesson4;

public class Student {
	int studentBookNumber;
	String name;
	String surname;
	int yearOfStudy;
	double middleMathematicsMark;
	double middleEconomicMark;
	double middleForeignLanguageMark;


}

//class StudentTest2{
//
//	double middleMathematicsMarkTest (String student1) {
//		double srednOcenka = (student1.middleMathematicsMark + middleEconomicMark + middleForeignLanguageMark ) / 3;
//		return srednOcenka;
//
//	}
//}


 class StudentTest {
	 public static void main(String[] args) {

	 Student student1 = new Student(); //1, "Ivan", "Ivanov", 2025, 4.5, 4.5, 4.5); - почему такое внесение данных в скобки new Student() не сработало ?
		 student1.studentBookNumber = 1;
		 student1.name = "Ivan";
		 student1.surname =  "Ivanov";
		 student1.yearOfStudy =  2025;
		 student1.middleMathematicsMark =  4.5;
		 student1.middleEconomicMark =  4.5;
		 student1.middleForeignLanguageMark =  4.5;

		 System.out.println("========");
//		 System.out.println(student1.middleMathematicsMarkTest(4.5, 4.5, 4.5));
		 System.out.println("========");


		 Student student2 = new Student();
		 student2.studentBookNumber = 2;
		 student2.name = "Petr";
		 student2.surname =  "Petrov";
		 student2.yearOfStudy =  2024;
		 student2.middleMathematicsMark =  4.4;
		 student2.middleEconomicMark =  4.4;
		 student2.middleForeignLanguageMark =  4.4;


		 System.out.println("========");
//		 System.out.println(student2.middleMathematicsMarkTest(4.4, 4.4, 4.4));
		 System.out.println("========");

		 Student student3 = new Student();
		 student3.studentBookNumber = 3;
		 student3.name = "Sidor";
		 student3.surname =  "Sidorov";
		 student3.yearOfStudy =  2025;
		 student3.middleMathematicsMark =  4.0;
		 student3.middleEconomicMark =  4.0;
		 student3.middleForeignLanguageMark =  4.0;

		 System.out.println("========");
//		 System.out.println(student3.middleMathematicsMarkTest(4.0, 4.0, 4.0));
		 System.out.println("========");

//		 System.out.println("student1 middleMark = " + (student1.middleMathematicsMark + student1.middleEconomicMark +  student1.middleForeignLanguageMark)/3);
//		 System.out.println("student2 middleMark = " + (student2.middleMathematicsMark + student2.middleEconomicMark +  student2.middleForeignLanguageMark)/3);
//		 System.out.println("student3 middleMark = " + (student3.middleMathematicsMark + student3.middleEconomicMark +  student3.middleForeignLanguageMark)/3);
//
	 }
}