package mk;

import test.*;

public class DemoInterface {
	public static void main(String[] args) {
		new IClass().mk();
		new IClass().mk2(111, 333);
		ITest.mk3(222, 444);
	}//main
}//class