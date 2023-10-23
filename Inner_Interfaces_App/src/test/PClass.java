package test;

public class PClass {
	public int x = 200;
	public static int y = 300;

	public void mk() {
		System.out.println("===PClass mk()===");
		System.out.println("The Value of x:" + x);
		System.out.println("The Value of y:" + y);
	}// OuterClass Instance Method

	public interface ITest1 {
		void m1(int x);
	}// InnerInterface Instance

	public static interface ITest2 {
		void m2(int y);
	}// InnerInterface static
}// OuterClass