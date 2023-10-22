package mk;

import java.util.*;

public class CursorStatements {
	@SuppressWarnings("removal")
	public static void main(String[] AA) {
		try {
			Vector<Integer> v = new Vector<Integer>();
			int i = 0;
			while (i <= 10) {
				v.add(new Integer(i));
				i++;
			} // end of loop
			System.out.println("===Displaying from Enumertion<E>===");
			Enumeration<Integer> e = v.elements();
			while (e.hasMoreElements()) {
				System.out.print(e.nextElement() + " ");
			} // end of loop
			System.out.println("\n===Displaying from Iterator<E>===");
			Enumeration<Integer> e2 = v.elements();
			Iterator<Integer> it = e2.asIterator();
			it.forEachRemaining((f) -> {
				System.out.print(f.toString() + " ");
			});
			System.out.println("\n===Displaying from Spliterator<E>===");
			Spliterator<Integer> sp = v.spliterator();
			sp.forEachRemaining((s) -> {
				System.out.print(s.toString() + " ");
			});
			System.out.println("\n===Displaying from Iterator<E>===");
			Iterator<Integer> it1 = v.iterator();
			it1.forEachRemaining((k) -> {
				System.out.print(k.toString() + " ");
			});
		} // end of try
		catch (Exception ex) {
			ex.printStackTrace();
		}//catch
	}//main
}//class