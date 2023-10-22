package test;

public class CClass extends PClass {
	public CClass(int x, int y, int z) {
		super(x, y);
		System.out.println("===CClass(x,y,z)===");
		System.out.println("The Value x: " + x + "\nThe Value y: " + y);
		System.out.println("The Value z: " + z);
	}

	public CClass(int x, int y, int z, int k) {
		this(x, y, z);
		System.out.println("===CClass(x,y,z,k)===");
		System.out.println("The Value x: " + x + "\nThe Value y: " + y);
		System.out.println("The Value z: " + z + "\nThe Value k: " + k);
	}
}//class