package test;

public class IClass implements ITest1 {
	public double value(int y, float z) {
		System.out.println("===IClass Value(y,z)===");
		return z - y;
	}

	public void mk(int x) {
		System.out.println("===IClass mk(k)===");
		System.out.println("The Value k:" + k);
		System.out.println("The Value x:" + x);
	}

	public void mk1(int y) {
		System.out.println("===IClass mk1(y)===");
		System.out.println("The Value k:" + k);
		System.out.println("The Value y:" + y);
	}
}//class