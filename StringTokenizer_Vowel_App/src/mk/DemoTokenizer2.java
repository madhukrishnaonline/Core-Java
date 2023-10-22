package mk;

import java.util.*;

public class DemoTokenizer2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = s.nextLine();
		System.out.println("Enter the Delimiter(break specification):");
		String dm = s.nextLine();
		char ch = dm.charAt(0);
		switch (ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			StringTokenizer st = new StringTokenizer(str, dm);// con_call
			System.out.println("count of tokens:" + st.countTokens());
			System.out.println("===Display Tokens===");
			while (st.hasMoreTokens()) {
				String tk = st.nextToken();
				System.out.println("Token:" + tk.toString());
				System.out.println("Count of Tokens:" + st.countTokens());
			} // end of loop
			break;
		default:
			System.out.println("Delemiter is not-Vowel...");
		}// end of switch
		s.close();
	}// main
}// class