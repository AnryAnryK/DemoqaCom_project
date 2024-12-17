package SelenideTestsPageObject.Components;

import java.security.SecureRandom;

public class RandomDataBase {

	public static void main(String[] args) {
		System.out.println(getRandomString(10));

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
}
