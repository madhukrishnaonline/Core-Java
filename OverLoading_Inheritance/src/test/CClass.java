package test;

public class CClass extends PClass {
	public static void mk(int x, int y, int z) {
		System.out.println("===CClass mk(x,y,z)===");
		System.out.println("The Value x:" + x + "\nThe Value y:" + y + "\nThe Value z:" + z);
	}

	public static void mk(int x, int y, int z, int k) {
		System.out.println("===CClass mk(x,y,z,k)===");
		System.out.println("The Value x:" + x + "\nThe Value y:" + y + "\nThe Value z:" + z + "\nThe Value k:" + k);
	}
	/*
	 * public void access() { super.mk(111); super.mk(222, 333); CClass.mk(444, 555,
	 * 666); CClass.mk(777, 888, 999, 000); }
	 */
}//class