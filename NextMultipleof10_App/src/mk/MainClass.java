package mk;

import java.util.Scanner;

import test.NextMultiple;

public class MainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s.nextInt();
		if (n < 0) {
			System.out.println(-1);
		} else if (n == 0) {
			System.out.println(-2);
		} else {
			NextMultiple nm = new NextMultiple();
			int result = nm.oddRounder(n);
			System.out.println("The value :" + result);
		}
		s.close();
	}//main
}//class