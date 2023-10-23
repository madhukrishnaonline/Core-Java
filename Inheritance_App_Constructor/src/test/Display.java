package test;

public class Display {
	public String bkName, author, publisher;
	public float price;

	public Display(String bkName, String author, String publisher, float price) {
		this.bkName = bkName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	public Display() {
		System.out.println("===Display===");
	}
}// class