package mk;

import java.util.*;

public class Collection_Deque {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				ArrayDeque<Integer> d = new ArrayDeque<Integer>();
				int i = 65;
				while (i <= 90) {
					d.add(new Integer(i));
					i++;
				} // end of loop
				System.out.println(d.toString());
				System.out.println("The Size :" + d.size());
				System.out.println("getFirst Element:" + d.getFirst());
				System.out.println("getLast Element:" + d.getLast());
				System.out.println("peekFirst:" + d.peekFirst());
				System.out.println("peekLast:" + d.peekLast());
				d.addFirst(new Integer(91));
				System.out.println("addFirst:" + d.toString());
				System.out.println("The Size :" + d.size());
				d.addLast(new Integer(66));
				System.out.println("addLast:" + d.toString());
				System.out.println("The Size :" + d.size());
				d.addFirst(new Integer(91));
				System.out.println("addFirst:" + d.toString());
				System.out.println("The Size :" + d.size());
				d.addLast(new Integer(66));
				System.out.println("addLast:" + d.toString());
				System.out.println("The Size :" + d.size());
				System.out.println("RemoveFirstOccurence:" + d.removeFirstOccurrence(91));
				System.out.println("the Elements:" + d.toString());
				System.out.println("The Size :" + d.size());
				System.out.println("RemoveLastOccurence:" + d.removeLastOccurrence(66));
				System.out.println("the Elements:" + d.toString());
				System.out.println("The Size :" + d.size());
				d.pollFirst();
				System.out.println("pollFirst:" + d.toString());
				System.out.println("The Size :" + d.size());
				d.pollLast();
				System.out.println("pollLast:" + d.toString());
				System.out.println("The Size :" + d.size());
			} // end of try
			catch (Exception ex) {
				ex.getMessage();
			}
		} // end of try
	}// main
}// class