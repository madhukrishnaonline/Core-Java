package mk;

import test.*;
import java.util.*;

public class StaticOverLoading {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new Scanner(System.in);
		System.out.println("Enter the Value of x:");
		int x = new Scanner(System.in).nextInt();
		System.out.println("Enter the Value of y:");
		int y = new Scanner(System.in).nextInt();
		System.out.println("Enter the Value of z:");
		int z = new Scanner(System.in).nextInt();
		System.out.println("Enter the Value of k:");
		int k = new Scanner(System.in).nextInt();
		System.out.println("====Choice====");
		System.out.println("1.mk(x)\n2.mk(x,y)\n3.mk(x,y,z)\n4.mk(x,y,z,k)");
		System.out.println("Enter the Choice:");
		switch (new Scanner(System.in).nextInt()) {
		case 1:
			CClass.mk(x);
			break;
		case 2:
			CClass.mk(x, y);
			break;
		case 3:
			CClass.mk(x, y, z);
			break;
		case 4:
			CClass.mk(x, y, z, k);
			break;
		default:
			System.out.println("Invalid Choice....");
		}//switch
	}//main
}//class