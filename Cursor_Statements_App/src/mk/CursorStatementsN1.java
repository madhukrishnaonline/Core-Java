package mk;

import java.util.*;

public class CursorStatementsN1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Vector<Character> v = new Vector<Character>();
		// System.out.println("Enter the Vector Objects:");
		for (int i = 65; i <= 90; i++) {
			v.add(new Character((char) i));
		}//for
		System.out.println("****Enumeration<E>****");
		Enumeration<Character> em = v.elements();
		while (em.hasMoreElements()) {
			System.out.print(" " + em.nextElement());
		}//while
		System.out.println("\n****Iterator<E>as****");
		Enumeration<Character> em2 = v.elements();
		Iterator<Character> it1 = em2.asIterator();
		/*
		 * while(it1.hasNext()) { System.out.print(" "+it1.next()); }
		 */
		it1.forEachRemaining((fe) -> {
			System.out.print(" " + fe.toString());
		});
		System.out.println("\n****ListIterator****");
		ListIterator<Character> li = v.listIterator();
		System.out.println("====Forward Direction====");
		/*
		 * while(li.hasNext()) { System.out.print(" "+li.next()); }
		 */
		li.forEachRemaining((lit) -> {
			System.out.print(" " + li.next());
		});
		System.out.println("\n====BackWard Direction====");
		while (li.hasPrevious()) {
			System.out.print(" " + li.previous());
		}//while
		System.out.println("\n****Iterator<E>****");
		Iterator<Character> it = v.iterator();
		it.forEachRemaining((sp) -> {
			System.out.print(" " + sp.toString());
		});
		System.out.println("\n****SplIterator<E>****");
		Spliterator<Character> spl = v.spliterator();
		spl.forEachRemaining((fer) -> {
			System.out.print(" " + fer.toString());
		});
		System.out.print("\n" + spl.characteristics());
		System.out.println("\n****forEach()****");
		v.forEach(e -> {
			System.out.print(" " + e.toString());
		});
	}//main
}//class