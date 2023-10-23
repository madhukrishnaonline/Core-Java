package mk;

import test.*;

public class InnerAbstractClass {
	public static void main(String[] args) {
		System.out.println("*****InnerAbstractClasses in Class*****");
		PClass pc = new PClass();
		PClass.ASClass ac = new PClass.ASClass() {
			public void m2() {
				System.out.println("===InnerAbstractClass Static m2()===");
			}
		};
		ac.m2();
		PClass.AClass aci = pc.new AClass() {
			public void m1() {
				System.out.println("===InnerAbstractClass Instance m1()===");
			}
		};
		aci.m1();
		ITest it = () -> {
			System.out.println("====Interface mk()====");
		};
		it.mk();
		System.out.println("****InnerAbstractClasses in Interfaces****");
		ITest.AIClass asi = new ITest.AIClass() {
			public void AA() {
				System.out.println("====InnerAbstractClass AA()====");
			}
		};
		asi.AA();
		System.out.println("*****InnerAbstractClasses in AbstractClass*****");
		AClass.AClass1 ac1 = new AClass.AClass1() {
			public void dd() {
				System.out.println("====InnerAbstractClass Static dd()====");
			}
		};
		ac1.dd();
		AClass acn = new AClass() {

		};
		AClass.AClass2 ac2 = acn.new AClass2() {
			public void gd() {
				System.out.println("====InnerAbstractClass Instance gd()====");
			}
		};
		ac2.gd();
	}// main
}// class