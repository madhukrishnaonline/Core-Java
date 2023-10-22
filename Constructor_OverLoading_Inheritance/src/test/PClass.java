package test;

public class PClass {
	public PClass(int x) {
		System.out.println("===PClass(x)===");
		System.out.println("The Value x: " + x);
	}

	public PClass(int x, int y) {
		this(x);
		System.out.println("===PClass(x,y)===");
		System.out.println("The Value x: " + x + "\nThe Value y: " + y);
	}
}// class