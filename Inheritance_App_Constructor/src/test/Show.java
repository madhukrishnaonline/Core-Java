package test;

public class Show extends Display {
	public Show(String bkName, String author, String publisher, float price) {
		super(bkName, author, publisher, price);
		System.out.println(super.bkName);
		System.out.println(super.author);
		System.out.println(super.publisher);
		System.out.println(super.price);
	}

	public Show() {
		System.out.println("===Show===");
	}//show
}//class