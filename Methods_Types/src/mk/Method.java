package mk;

public class Method {
	public float pv(int x, int y) {
		System.out.println("===With Parameters & With r_T===");
		return x + y;
	}

	public void st(float a, float b) {
		System.out.println("Without r_t With Para...");
	}

	public char mm() {
		return 'j';
	}

	public void kk() {
		System.out.println("no r_t no arg...");
	}

	public static void main(String[] args) {
		Method m = new Method();
		float f = m.pv(111, 222);
		System.out.println(f);
		m.st(333.3f, 444.4f);
		int i = m.mm();
		System.out.println(i);
		m.kk();
	}//main
}//class