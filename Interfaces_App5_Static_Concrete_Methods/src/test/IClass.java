package test;

public class IClass implements Interface {
	public int mk(int x) { // implemented method
		System.out.println("===abstract mk()===");
		return x;
	}

	public void dis() { // non-implemented
		System.out.println("=== non-abstract dis()===");
	}
}//class