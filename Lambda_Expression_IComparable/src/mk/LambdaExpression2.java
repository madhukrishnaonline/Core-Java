package mk;

import test.*;
import java.util.*;

public class LambdaExpression2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of x : ");
		int x = sc.nextInt();
		System.out.println("Enter the Value of y : ");
		int y = sc.nextInt();
		System.out.println("===Choice===");
		System.out.println("1.Greater \n2.Smaller");
		System.out.println("Enter the Choice : ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			// LambdaExpression
			ICompare ob = (int val1, int val2) -> {
				if (val1 > val2)
					return x;
				else
					return y;
			};
			// ob.compare(x, y);
			System.out.println("The Greater value :" + ob.compare(x, y));
			break;
		case 2:
			// LambdaExpression
			ICompare ob1 = (int val1, int val2) -> {
				if (val1 < val2)
					return x;
				else
					return y;
			};
			// ob1.compare(x, y);
			System.out.println("The Smaller value: " + ob1.compare(x, y));
			break;
		default:
			System.out.println("Invalid Choice...");
		}
		sc.close();
	}//main
}//class