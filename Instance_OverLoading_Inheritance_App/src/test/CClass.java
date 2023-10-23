package test;

public class CClass extends PClass {
	public int b = 200;

	public void mk(int x, int y, int z) {
		super.mk(x, y);
		System.out.println("===CClass mk(x,y,z)===");
		System.out.println("The Value x: " + x + "\nThe Value y: " + y + "\nThe Value z: " + z);
	}

	public void mk(int x, int y, int z, int k) {
		this.mk(x, y, z);
		System.out.println("===CClass mk(x,y,z,k)===");
		System.out.println("The Value x: " + x + "\nThe Value y: " + y + "\nThe Value z: " + z + "\nThe Value k: " + k);
	}

	public void dis() {
		System.out.println("PClass Value: " + super.a);
		System.out.println("CClass Value: " + this.b);
	}
}//class