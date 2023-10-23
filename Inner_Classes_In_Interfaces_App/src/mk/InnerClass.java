package mk;

import test.AClass;

public class InnerClass {
	public static void main(String[] args)
	/**
	 * throws ClassNotFoundException, InstantiationException, IllegalAccessException
	 */
	// NoSuchMethodException
	{
		// Class c = Class.forName("test.ITClass");
		test.ITClass ts = () -> {
			System.out.println("===Interface mm()===");
		};
		ts.mm();
		System.out.println("****InnerClass In Interface****");
		test.ITClass.InClass in = new test.ITClass.InClass();
		in.mk();
		System.out.println("****InnerClasses in AbstractClass****");
		// Class c1 = Class.forName("test.AClass");
		test.AClass ac = new test.AClass() {
			public void kk() {
				System.out.println("====AbstractClass kk()====");
			}
		};
		ac.kk();
		System.out.println("****InnerClasses Instance In AbstractClass****");
		AClass.AInClass aci = ac.new AInClass();
		aci.AA();
		System.out.println("****InnerClasses Static In AbstractClass****");
		AClass.AInSClass.AAA();
	}//main
}//class