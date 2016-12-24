package book;

public class Book {
	private int id;
	private String name;
	private String author;
	
	public Book() {
		
	}
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;		
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "author: " + author + " name: " + name;
	}
}


