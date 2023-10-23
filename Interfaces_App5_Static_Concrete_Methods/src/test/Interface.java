package test;

public interface Interface {
	int mk(int x);

	static void m1(int y) {
		System.out.println("===static m1(y)==");
		System.out.println("The Value y : " + y);
	}

	static void interfaces(int z) {
		System.out.println("===static Interface()==");
		System.out.println("The Value z : " + z);
	}
}//interface