package mk;

import java.util.*;

public class StringCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String-1:");
		String s1 = sc.nextLine();
		System.out.println("Enter the String-2:");
		String s2 = sc.nextLine();
		int k = s1.compareTo(s2);
		if (k == 0) {
			System.out.println("Strings are equal...");
		} // if
		else {
			System.out.println("Greater String..");
			if (k > 0) {
				System.out.println(s1.toString());
			} // if
			else {
				System.out.println(s2.toString());
			} // else
		} // else
		sc.close();
	}// main
}// class