package test;

public class CClass extends PClass {
	@Override
	public void mk(int j) {
		System.out.println("===CClass===");
		System.out.println("===mk(j)===");
		System.out.println("The Value j:" + j);
	}

	@Override
	public void mk2(int k) {
		System.out.println("===CClass===");
		System.out.println("===mk(k)===");
		System.out.println("The Value k:" + k);
	}

	public void cases(int z) {
		System.out.println("===CClass(z)===");
		System.out.println("The Value z: " + z);
	}
}//class