package mk;

import java.util.*;
import test.EvenOdd;

public class DemoEvenOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = s.nextInt();
		EvenOdd eo = new EvenOdd();
		int result = eo.isEven(n);
		System.out.println("given number is:" + result);
		s.close();
	}//main
}//class