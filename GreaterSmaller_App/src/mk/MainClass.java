package mk;

import java.util.*;
import test.*;

public class MainClass {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Value x :");
		int val1 = a.nextInt();
		System.out.println("Enter Value y :");
		int val2 = a.nextInt();
		System.out.println("Enter Value z :");
		int val3 = a.nextInt();
		System.out.println("==Choice==");
		System.out.println("1.Greater\n2.Smaller ");
		System.out.println("Enter Choice : ");
		int choice = a.nextInt();
		switch (choice) {
		case 1:
			Greater gt = new Greater();
			int r1 = gt.compare(val1, val2, val3);
			System.out.println("Greater Value :" + r1);
			break;
		case 2:
			Smaller sm = new Smaller();
			int r2 = sm.compare(val1, val2, val3);
			System.out.println("Smaller Value :" + r2);
			break;
		default:
			System.out.println("Invalid choice....");
		}// end of switch
		a.close();
	}//main
}//class