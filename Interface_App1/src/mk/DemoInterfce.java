package mk;

import test.*;

public class DemoInterfce {
	public static void main(String[] args) {
		IClass ic = new IClass();
		double d = ic.value(500, 500.55f);
		System.out.println("The Sub :" + d);
		ic.mk(111);
		ic.mk1(222);
	}//main
}//class