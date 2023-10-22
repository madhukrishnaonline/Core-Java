package mk;

import test.Electronics;
import java.util.*;

public class DemoEnum2 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Electronics[] ec = Electronics.values();
		// ec[0] = ;
		System.out.println(ec.length);
		System.out.println("****Enum<E> Objects****");
		for (Electronics e : ec) {
			System.out.println("Electronics: " + e.toString() + "\nPrice: " + e.price);
		}
		System.out.println("Set Price for Electronics:");
		for (Electronics fe : ec) {
			System.out.println("Price for: " + fe);
			fe.setPrice(new Float(sc.nextFloat()));
			System.out.println("Electronics: " + fe.toString() + "\nPrice: " + fe.price);
		}
		sc.close();
	}//main
}//class