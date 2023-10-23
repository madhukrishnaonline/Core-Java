package mk;

import java.util.*;
import test.Greatest;

public class MainGreatest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number x :");
		int x = s.nextInt();
		System.out.println("Enter number y :");
		int y = s.nextInt();
		if (x > 0 && y > 0) {
			Greatest gt = new Greatest();
			int result = gt.getGreatest(x, y);
			System.out.println("The greatest Number is " + result);
		} else if (x < 0 || y < 0) {
			System.out.println(-1);
		} else {
			System.out.println(-2);
		}
		s.close();
	}//main
}//class