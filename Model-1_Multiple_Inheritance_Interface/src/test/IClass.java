package test;

public class IClass implements ITest1, ITest2 {
	public void m1(int x) {
		System.out.println("====ITest1 m1(x)===");
		System.out.println("The Value of x: " + x);
	}

	public void m2(int y) {
		System.out.println("====ITest1 m2(y)===");
		System.out.println("The Value of y: " + y);
	}

	public void mk() {
		System.out.println("===IClass mk()===");
	}
}//class