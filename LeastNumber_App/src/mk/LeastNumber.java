package mk;

import java.util.*;
import test.Least;

public class LeastNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x = s.nextInt();
		System.out.println("Enter the value of y:");
		int y = s.nextInt();
		if (x > 0 && y > 0) {
			Least l = new Least();
			int result = l.getLeastNum(x, y);
			System.out.println("The least Number:" + result);
		} else if (x < 0 || y < 0) {
			System.out.println(-1);
		} else {
			System.out.println(-2);
		}//else
		s.close();
	}//main
}//class