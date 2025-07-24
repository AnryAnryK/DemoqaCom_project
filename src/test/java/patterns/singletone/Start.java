package patterns.singletone;

public class Start {
	public static void main(String[] args) {
		Singletone singletone1 = Singletone.getSingletone();
		System.out.println("singletone1: " +singletone1); //единый результат patterns.Singletone.Singletone@7ab2bfe1
		Singletone singletone2 = Singletone.getSingletone();
		System.out.println("singletone2: " +singletone2); //единый результат patterns.Singletone.Singletone@7ab2bfe1


	}
}
