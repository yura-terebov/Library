package library;

import java.util.ArrayList;

import book.Book;

public class Library {
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public void addBook(String bookName, String author) {
		books.add(new Book(bookName, author));
	}
	
	public void remove(String bookName) {
		
	}
}
