package JavaCore.lesson6.dop6;

public class Book {
	String title;

	Book(String title) {
		this.title = title;
	}

	String renameBook(Book book, String newTitle) {
		book.title=newTitle;
		return book.title;
	}

	public static void main(String[] args) {
		Book book = new Book("Остров сокровищ");
		System.out.println("Название книги: "+book.title);
		System.out.println("Переименованное Название книги: "+book.renameBook(book, "12 негритят"));
	}
}
