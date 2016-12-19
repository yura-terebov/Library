package book;

public class Book {
	private String bookName;
	private String author;
	
	public Book(String book, String author) {
		this.bookName = book;
		this.author = author;
	}
	
	public String getName() {
		return this.bookName;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setName(String otherName) {
		this.bookName = otherName;
	}
	
	public void setAuthor(String otherAuthor) {
		this.bookName = otherAuthor;
	}
}
