package three50.book;

public class Book {

	private String name = "";
	private String author = "";
	private String publisher = "";
	private String date = "";
	private int price = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void info() {
		System.out.println("제목: " + name);
		System.out.println("지은이: " + author);
		System.out.println("출판사: " + publisher);
		System.out.println("출판날짜: " + getDate());
		System.out.println("가격: " + getPrice() + "원");
	}
	
	
}
