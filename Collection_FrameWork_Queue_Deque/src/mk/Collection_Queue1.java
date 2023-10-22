package mk;

import java.util.*;

public class Collection_Queue1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		int i = 0;
		while (i <= 5) {
			q.add(new Integer(i));
			i++;
		}
		System.out.println("The Elements:" + q.toString());
		// System.out.println("Elements Removed :"+q.remove());
		// System.out.println(q.toString());
		System.out.println("poll: " + q.poll() + "\nPoll:" + q.toString());
		System.out.println("Peek: " + q.peek() + "\nPeek:" + q.toString());
		q.element();
		System.out.println("Element: " + q.toString());
		q.offer(new Integer(0));
		System.out.println("Offer: " + q.toString());
	}// main
}// class