package mk;

import java.util.*;

public class CollectionList {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ArrayList<Float> al = new ArrayList<Float>();
		System.out.println("====al====");
		al.add(new Float(1.20f));
		al.add(new Float(4.10f));
		al.add(new Float(2.80f));
		al.add(new Float(5.90f));
		al.add(new Float(6.70f));
		System.out.println(al.toString());
		System.out.println("===add(Index,ele)===");
		al.add(1, 3.30f);
		System.out.println(al.toString());
		ArrayList<Float> al1 = new ArrayList<Float>();
		al1.add(new Float(1.20f));
		al1.add(new Float(41.10f));
		al1.add(new Float(22.80f));
		al1.add(new Float(53.90f));
		al1.add(new Float(64.70f));
		System.out.println("=====al1=====");
		System.out.println(al1.toString());
		System.out.println("===addAll(obj)===");
		System.out.println(al1.addAll(al));
		System.out.println(al1.toString());
		System.out.println("size: " + al1.size());
		System.out.println("===addAll(ele)===");
		System.out.println(al1.addAll(3, al));
		System.out.println(al1.toString());
		System.out.println("size: " + al1.size());
		System.out.println("===removeAll===");
		System.out.println(al1.removeAll(al));
		System.out.println(al1.toString());
		System.out.println("===subList===");
		List<Float> al2 = al1.subList(2, 4);
		System.out.println(al2.toString());
	}// main
}// class