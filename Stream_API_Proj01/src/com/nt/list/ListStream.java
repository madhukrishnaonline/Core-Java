package com.nt.list;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ListStream {
	public static void main(String[] args) {

		ArrayList<UserData> list = new ArrayList<UserData>();
		list.add(new UserData("madhukrishnaonline", "Madhu", "Krishna", "Kummari", 9121493579l, "ameerpet"));
		list.add(new UserData("krishnaonline", "Madhu", "Krishna", "Kummari", 9121493579l, "ameerpet"));
		list.add(new UserData("madhuonline", "Madhu", "Krishna", "Kummari", 9121493579l, "ameerpet"));
		System.out.println("=====Terminal forEach()=====");
		Stream<UserData> stream1 = list.stream();
		stream1.forEach(x -> System.out.println(x));

		System.out.println("====sorted()=====");
		Stream<UserData> stream2 = list.stream();
		stream2.sorted(new SortByUserName()).forEach(n -> System.out.println(n));
	}// main
}// class