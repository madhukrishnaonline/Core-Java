package mk;

import java.util.*;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1 = new String(sc.nextLine());
		int k = s1.length() - 1;
		int count = 0;
		for (int i = 0; i <= s1.length() - 1; i++) {
			char ch1 = s1.charAt(i);
			char ch2 = s1.charAt(k);
			if (ch1 == ch2) {
				count++;
			}
			k--;
		}
		if (count == s1.length()) {
			System.out.println("Palindrome String...");
		} else {
			System.out.println("Not Palindrome string....");
		}
		sc.close();
	}
}