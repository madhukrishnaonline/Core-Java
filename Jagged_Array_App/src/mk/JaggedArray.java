package mk;

import java.util.*;

public class JaggedArray {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				System.out.println("Enter the Size of Array-1:");
				Integer size1 = new Integer(Integer.parseInt(sc.nextLine()));
				String s1[] = new String[size1];
				System.out.println("Enter the " + size1 + " Objects to hold Array-1 Objects :");
				for (int i = 0; i <= s1.length - 1; i++) {
					s1[i] = new String(sc.nextLine());
				} // end of loop
				System.out.println("Enter the Size of Array-2:");
				Integer size2 = new Integer(Integer.parseInt(sc.nextLine()));
				String s2[] = new String[size2];
				System.out.println("Enter the " + size2 + " Objects to hold Array-2 Objects :");
				for (int i = 0; i <= s2.length - 1; i++) {
					s2[i] = new String(sc.nextLine());
				} // end of loop
				String s[][] = { s1, s2 };
				System.out.println("===Displaying from Jagged Array===");
				for (String[] k : s) {
					System.out.println("Array: ");
					for (String m : k) {
						System.out.println(m.toString() + " ");
					} // Inner Loop
				} // Outer Loop
				System.out.println("===Ascending Order===");
				Arrays.sort(s1);
				for (String f : s1) {
					System.out.println(f.toString());
				}
				Arrays.sort(s2);
				for (String o : s2) {
					System.out.println(o.toString());
				}
				System.out.println("===Descending Order===");
				for (int i = s1.length - 1; i >= 0; --i) {
					System.out.println(s1[i]);
				}
				for (int i = s2.length - 1; i >= 0; --i) {
					System.out.println(s2[i]);
				} // end of loop
				for (String v : s1) {
					char ch = v.charAt(0);
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
						StringBuffer sb = new StringBuffer(v);
						System.out.println(sb.reverse());
						break;
					default:
						System.out.println(v.toString());
					}// end of switch
				} // end of loop
				for (String w : s2) {
					char ch = w.charAt(0);
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
						StringBuffer sb1 = new StringBuffer(w);
						System.out.println(sb1.reverse());
						break;
					default:
						System.out.println(w.toString());
					}// end of switch
				} // end of loop
			} // end of try
			catch (Exception ex) {
				System.out.println("Enter Integer Values Only...");
				ex.getMessage();
			}//catch
		} // end of try-with-resource
	}//main
}//class