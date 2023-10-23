package mk;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		int len = str.length();
		int count = 0;
		int k = len - 1;
		for (int i = 0; i <= len - 1; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(k);
			if (ch1 == ch2) {
				count++;
			}
			k--;
		} // end of loop
		if (count == len) {
			System.out.println("Palindrome String...");
		} else {
			System.out.println("not a Palindrome String...");
		}
		sc.close();
	}//main
}//class