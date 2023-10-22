package mk;

import test.*;

public class ConstructorOverLoad {
	public static void main(String[] args) {
		CClass cc = new CClass(111, 222, 333, 444);
		System.out.println("HashCode of CClass:" + cc.hashCode());
	}//main
}//class