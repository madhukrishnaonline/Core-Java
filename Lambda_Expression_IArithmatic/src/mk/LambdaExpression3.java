package mk;

import test.*;
import java.util.*;

public class LambdaExpression3 {
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
			// LambdaExpression
			IArithmatic ad = (int v1, int v2) -> {
				return v1 + v2;
			};
			System.out.println("Sum : " + ad.compare(x, y));
			break;
		case 2:
			// LambdaExpression
			IArithmatic sb = (int v1, int v2) -> {
				return v1 - v2;
			};
			System.out.println("Sub: " + sb.compare(x, y));
			break;
		case 3:
			// LambdaExpression
			IArithmatic ml = (int v1, int v2) -> {
				return v1 * v2;
			};
			System.out.println("Mul: " + ml.compare(x, y));
			break;
		case 4:
			// LambdaExpression
			IArithmatic div = (int v1, int v2) -> {
				return (float) v1 / v2;
			};
			System.out.println("Division: " + div.compare(x, y));
			break;
		case 5:
			// LambdaExpression
			IArithmatic md = (int v1, int v2) -> {
				return v1 % v2;
			};
			System.out.println("ModDivision: " + md.compare(x, y));
			break;
		case 6:
			// LambdaExpression
			IArithmatic ag = (int v1, int v2) -> {
				return (float) v1 + v2 / 2;
			};
			System.out.println("Average: " + ag.compare(x, y));
			break;
		default:
			System.out.println("Invalid Choice...");
		}
		sc.close();
	}//main
}//class