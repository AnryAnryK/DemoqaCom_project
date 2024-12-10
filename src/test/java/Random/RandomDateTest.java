package Random;

import java.time.LocalDate;

public class RandomDateTest extends RandomDate {

public static void main(String[] args) {
	LocalDate date;
	RandomDateTest randomDateTest = new RandomDateTest();
	date = randomDateTest.generate();
	System.out.println(randomDateTest.generate());
	System.out.println();
}
}
