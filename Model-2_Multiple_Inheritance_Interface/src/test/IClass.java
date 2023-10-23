package test;

public class IClass extends PClass implements ITest1, ITest2 {
	public void plutonium(int p) {
		System.out.println("====ITest2 plutonium(p)====");
		System.out.println("The Value of p:" + p);
	}

	public void h2o(int h) {
		System.out.println("====ITest1 h2o(h)====");
		System.out.println("The Value of h:" + h);
	}
}//class