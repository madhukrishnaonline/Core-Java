package test;

public interface ITest {
	void mk();

	default void mk2(int x, int a) {
		System.out.println("====Non-static Concrete methods===");
		System.out.println("The Value x:" + x);
		this.mk4(a);
	}

	static void mk3(int y, int b) {
		System.out.println("===Static concrete Method===");
		System.out.println("The Value y:" + y);
		ITest.mk5(b);
	}

	private void mk4(int a) {
		System.out.println("===Private Non-Static Concrete method mk4(a)===");
		System.out.println("The value a:" + a);
	}

	private static void mk5(int b) {
		System.out.println("===Private Static Concrete method mk4(a)===");
		System.out.println("The value b:" + b);
	}
}//class