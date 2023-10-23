package test;

public class IClass implements ITest2 {
	public void m1(int x) {
		System.out.println("===ITest1 m1(x)===");
		System.out.println("The Value x:" + x);
	}

	public void m2(int y) {
		System.out.println("===ITest2 m2(y)===");
		System.out.println("The Value y:" + y);
	}
}//class