package mk;

import java.util.*;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = new String(sc.nextLine());
		System.out.println("Displaying String in Ascending Order with index Value...");
		int n = 0;
		while (n <= str.length() - 1) {
			char ch = str.charAt(n);
			System.out.print(ch);
			System.out.println("   " + n);
			n++;
		}//while
		System.out.println("Displaying String in Descending Order with index Value...");
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
			System.out.println("  " + i);
		}//for
		sc.close();
	}//main
}//class