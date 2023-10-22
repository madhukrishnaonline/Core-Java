package mk;

import java.util.*;

public class CollectionQueue {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i <= 5; i++) {
			pq.add(new Integer(i));
		} // for
		System.out.print("The Elements: " + pq);
		System.out.println(pq.poll() + "\nPoll: " + pq.toString());
		System.out.println(pq.offer(new Integer(sc.nextInt())) + "\nOffer: " + pq);
		sc.close();
	}// main
}// class