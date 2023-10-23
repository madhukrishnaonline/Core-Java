package test;

public class PClass {
	public int a = 300;

	public void mk(int x) {
		System.out.println("===PClass mk(x)===");
		System.out.println("The Value x: " + x);
	}

	public void mk(int x, int y) {
		this.mk(x);
		System.out.println("===PClass mk(x,y)===");
		System.out.println("The Value x: " + x + "\nThe Value y:" + y);
	}
}//class