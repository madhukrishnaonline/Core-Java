package mk;

import test.SClass;

public class Mutable {
	public static void main(String[] args) {
		SClass sc = new SClass();
		sc.mk(3);
		sc.y = 60;
		System.out.println("The Value y:" + sc.y);
		SClass.x = 50;
		System.out.println("The Value x :" + SClass.x);
	}
}//class