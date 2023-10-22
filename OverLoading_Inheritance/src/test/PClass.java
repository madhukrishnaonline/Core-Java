package test;

public class PClass {
	public static void mk(int x) {
		System.out.println("===PClass mk(x)===");
		System.out.println("The Value x:" + x);
	}

	public static void mk(int x, int y) {
		System.out.println("===PClass mk(x,y)===");
		System.out.println("The Value x:" + x + "\nThe Value y:" + y);
	}
}//class