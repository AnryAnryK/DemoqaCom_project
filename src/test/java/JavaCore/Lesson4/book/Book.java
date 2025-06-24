package JavaCore.Lesson4.book;

import java.util.Arrays;

public class Book {

	String title;
	String author;
	int year;
	double price;

	Book() {
		this.title = "t";
		this.author = "a";
		this.year = 0;
		this.price = 0.0;
	}

	Book(String title, String author, int year, double price) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.price = price;
	}


	String[] displayInfo() {
		String[] bookInformation = new String[4];
		bookInformation[0] = title;
		bookInformation[1] = author;
		bookInformation[2] = String.valueOf(year);
		bookInformation[3] = String.valueOf(price);
		return bookInformation;
//		System.out.println(title);
//		System.out.println(author);
//		System.out.println(year);
//		System.out.println(price);
	}


}

class BookTest {
	public static void main(String[] args) {
		Book book = new Book("Chapter", "Agata Cristy", 2025, 200);
		System.out.println(Arrays.toString(book.displayInfo()));

		Book book2 = new Book("Chapter2", "Agata Cristy2", 2024, 201);
		System.out.println(Arrays.toString(book2.displayInfo()));

		Book book3 = new Book();
		System.out.println(Arrays.toString(book3.displayInfo()));



	}
}


