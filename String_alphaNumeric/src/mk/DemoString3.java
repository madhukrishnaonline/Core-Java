package mk;

import java.util.*;

public class DemoString3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		int len = str.length();
		int alphabets = 0, numbers = 0, count = 0;
		for (int i = 0; i <= len - 1; i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;
			}// end of switch
			int p = (int) ch;// char to ASCII(int_values)
			if (p >= 65 && p <= 90) {
				alphabets++;
			}
			if (p >= 97 && p <= 122) {
				alphabets++;
			}
			if (p >= 48 && p <= 57) {
				numbers++;
			}
		} // end of loop
		System.out.println("Count of Vowels:" + count);
		System.out.println("Count of Consonents:" + (alphabets - count));
		System.out.println("Count of Numbers:" + numbers);
		System.out.println("Count of Others:" + (len - (alphabets + numbers)));
		s.close();
	}//main
}//class