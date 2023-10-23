package mk;

import test.*;

@SuppressWarnings("unused")
public class Generalization {
	public static void main(String[] args) {
		System.out.println("****Generalization Process****");
		PClass pc = (PClass) new CClass();
		pc.mk(111);
		pc.mk2(222);
		System.out.println("****Specialization Process****");
		CClass cc = (CClass) new PClass();
		// cc.mk(333);
		// cc.mk2(444);
		// cc.cases(555);
	}//main
}//class