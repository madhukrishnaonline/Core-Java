package mk;

import test.*;
import java.util.*;

public class DemoInterface {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new Scanner(System.in);
		System.out.println("Enter the Value of x:");
		int x = new Scanner(System.in).nextInt();
		System.out.println("Enter the Value of y:");
		int y = new Scanner(System.in).nextInt();
		System.out.println("Enter the Value of z:");
		int z = new Scanner(System.in).nextInt();
		System.out.println("====Choice===");
		System.out.println("1.Greater\n2.Smaller");
		System.out.println("Enter the Choice:");
		switch (new Scanner(System.in).nextInt()) {
		case 1:
			System.out.println("" + new Greater().compare(x, y, z));
			break;
		case 2:
			System.out.println("" + new Smaller().compare(x, y, z));
			break;
		default:
			System.out.println("Invalid Choice....");
			break;
		}//switch
	}//main
}//class