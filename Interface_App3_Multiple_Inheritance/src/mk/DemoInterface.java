package mk;

import test.IClass;

public class DemoInterface {
	public static void main(String[] args) {
		IClass ic = new IClass();
		double d = ic.fuck(5500, 5500.5576f);
		System.out.println("The Division :" + d);
		int i = ic.fcuk(7890, 12.465f);
		System.out.println("The Sum:" + i);
	}//main
}//class