package mk;

import test.*;
import java.util.*;

public class DemoInheritance4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of x :");
		int x = sc.nextInt();
		System.out.println("Enter the Number of y :");
		int y = sc.nextInt();
		System.out.println("===Choice===");
		System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.ModDivision \n6.Average");
		System.out.println("Enter the Choice : ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			Addition ad = new Addition();
			int r1 = ad.compare(x, y);
			System.out.println("Sum : " + r1);
			break;
		case 2:
			Subtraction sb = new Subtraction();
			int r2 = sb.compare(x, y);
			System.out.println("Subtraction : " + r2);
			break;
		case 3:
			Multiplication ml = new Multiplication();
			int r3 = ml.compare(x, y);
			System.out.println("Multiplication : " + r3);
			break;
		case 4:
			Division dv = new Division();
			float r4 = dv.compare(x, y);
			System.out.println("Division : " + r4);
			break;
		case 5:
			ModDivision md = new ModDivision();
			float r5 = md.compare(x, y);
			System.out.println("ModDivision : " + r5);
			break;
		case 6:
			Average ag = new Average();
			float r6 = ag.compare(x, y);
			// float result = (float)(x+y/2);
			System.out.println("Average : " + r6);
			break;
		default:
			System.out.println("Invalid Choice...");
		}
		sc.close();
	}//main
}//class