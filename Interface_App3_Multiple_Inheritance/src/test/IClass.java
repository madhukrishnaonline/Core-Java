package test;

public class IClass implements ITest1, ITest2 {
	public double fuck(int x, double y) {
		System.out.println("===ITest1 fuck(x,y)===");
		System.out.println("The Value x:" + x);
		System.out.println("The Value y:" + y);
		return x / y;
	}

	public int fcuk(int a, float b) {
		System.out.println("===ITest2 fcuk(a,b)===");
		System.out.println("The Value a:" + a);
		System.out.println("The Value b:" + b);
		return (int) b + a;
	}
}//class