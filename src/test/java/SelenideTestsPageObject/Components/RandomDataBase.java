package SelenideTestsPageObject.Components;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDataBase {

	public static void main(String[] args) {
		System.out.println(getRandomString(10));
		System.out.println(getRandomEmail());
		System.out.println(getRandomphoneNumber(0000000001L, 9999999999L));


//	public static String randomString (int len) {
//
//		return "";
//	}
	}

	public static String getRandomString(int len) {
//        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; //уберём Цифры, т.к. мы хотим получить рандомное Имя (в котором не бывает Цифр) // SmNzDtTbEV

		SecureRandom rnd = new SecureRandom();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < len; i++)
			result.append(AB.charAt(rnd.nextInt(AB.length())));

		return result.toString();
	}

	public static String getRandomEmail() {
		return getRandomString(10) + "@mail.com";
	}

	public static long getRandomphoneNumber(long min, long max) {
		return ThreadLocalRandom.current().nextLong(min, max + 1);
	}

	public static String getRandomsubject2() {
		return getRandomString(10);
	}
}
