package test;

public class IClass implements ITest3 {
	public void mia(String mk) {
		System.out.println("====Interface ITest1====");
		System.out.println("mk stands for: " + mk);
	}

	public void dani(String dd) {
		System.out.println("====Interface ITest2====");
		System.out.println("dd stands for: " + dd);
	}

	public void gia(String gd) {
		System.out.println("====Interface ITest3====");
		System.out.println("gd stands for: " + gd);
	}
}// class