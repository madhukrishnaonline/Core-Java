package mk;

import test.*;

public class Generalization {
	public static void main(String[] args) {
		System.out.println("****Normal Interface Process***");
		IClass ic = new IClass();
		ic.mk('m');
		System.out.println("****Generalization Process***");
		ITest it = (ITest) new IClass();
		it.mk('k');
		System.out.println("****Specialization Process****");
		// IClass ic1 = new ITest();
		System.out.println("//IClass ic1 = new ITest();//Error....");
	}//main
}//class