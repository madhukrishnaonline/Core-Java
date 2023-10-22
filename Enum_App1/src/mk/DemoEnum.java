package mk;

import test.cars;
import java.util.*;

public class DemoEnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cars c[] = cars.values();
		// c[0] = 1500;
		// c[1] = 1700;
		// c[2] = 1900;
		System.out.println("===Displaying Enum<E> Objects===");
		for (cars x : c) {
			System.out.println("The Cars :" + x.toString() + " " + x.price + " Thousand $");
		}
		System.out.println("===Set Values using setter method===");
		for (cars y : c) {
			System.out.println("Price for " + y);
			y.setPrice(sc.nextInt());
		}
		System.out.println("===get Values using getter method===");
		for (cars z : c) {
			z.getPrice();
			System.out.println("The Cars :" + z.toString() + " " + z.price + " Thousand $");
		}
		sc.close();
	}//main
}//class