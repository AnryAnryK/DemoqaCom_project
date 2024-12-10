package Random;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDate {

	private int randomValue(int origin, int bound){
return ThreadLocalRandom.current().nextInt(origin, bound);
	}
	public LocalDate generate() {
		int day = randomValue(1, 32);
		int month = randomValue(1, 13);
		int year = randomValue(1, 2025);

		return LocalDate.of(year, month, day);
	}
}
