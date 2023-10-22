package mk;

import java.util.*;

public class CollectionStack {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i <= 10; i++) {
			st.push(new Integer(i));
		} // end of loop
		System.out.print("The Elements:" + st);
		System.out.println("\nSize: " + st.size());
		System.out.println("Element Popped:" + st.pop());
		System.out.print("The Elements:" + st);
		System.out.println("\nSize: " + st.size());
		System.out.println("Peek Element: " + st.peek());
		System.out.println("Enter the element to be searched:");
		System.out.println(st.search(new Integer(sc.nextInt())));
		sc.close();
	}// main
}// class