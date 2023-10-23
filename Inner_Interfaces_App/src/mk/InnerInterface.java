package mk;

import test.*;

public class InnerInterface {
	public static void main(String[] args) {
		PClass pc = new PClass();
		pc.mk();
		System.out.println("****InnerInterface in Class****");
		PClass.ITest1 it = (int x) -> {
			System.out.println("===ITest1 m1()===");
			System.out.println("The Value of x:" + x);
		};
		it.m1(pc.x);
		PClass.ITest2 it2 = (int y) -> {
			System.out.println("===ITest2 m2(y)===");
			System.out.println("The Value of y:" + y);
		};
		it2.m2(PClass.y);
		System.out.println("****InnerInterface in Interface****");
		ITest it3 = (float f) -> {
			System.out.println("===ITest mk(f)===");
			System.out.println("The Value of f:" + f);
		};
		it3.mk(222.34f);
		ITest.SITest sit = (String str) -> {
			System.out.println("===SITest kk(str)===");
			System.out.println("The Value str:" + str);
		};
		sit.kk("");
		System.out.println("****AbstractClass****");
		AClass ac = new AClass() {
			public void abs(double d) {
				System.out.println("===AClass abs(d)===");
				System.out.println("The Value d:" + d);
			}
		};
		ac.abs(45673.546);
		System.out.println("****InnerInterface Instance AbstractClass****");
		AClass.AInterf in = new AClass.AInterf() {
			public void AA(boolean b) {
				System.out.println("===InnerInterface AA(b)===");
				System.out.println("The Value b:" + b);
			}
		};
		in.AA(true);
		System.out.println("****InnerInterface Static AbstractClass****");
		AClass.ASInterf ins = (char ch) -> {
			System.out.println("===InnerInterface AAA(ch)====");
			System.out.println("The Value ch:" + ch);
		};
		ins.AAA('7');
	}//main
}//class