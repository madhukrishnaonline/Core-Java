package com.nt.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayStream1 {
	public static void main(String[] args) {
		Integer i[] = { 5, 4, 3, 2, 7, 9 };

		Stream<Integer> stream = Arrays.stream(i);
		System.out.println("=====Terminal forEach()=====");
		stream.forEach(y -> System.out.println(y));

		System.out.println("=====Intermediate filter() & Terminal forEach()=====");
		Stream<Integer> stream1 = Arrays.stream(i);
		stream1.filter(x -> x % 2 != 0).forEach(y -> System.out.println(y));

		System.out.println("=====Intermediate map() & collect() & Terminal forEach()=====");
		Stream<Integer> stream2 = Arrays.stream(i);
		List<Integer> list = stream2.map(x -> x * x).collect(Collectors.toList());
		list.forEach(x -> System.out.println(x));

		System.out.println("====Intermediate sorted() &Terminal forEach()=====");
		Stream<Integer> stream3 = Arrays.stream(i).sorted();
		// stream3.sorted();
		stream3.forEach(s -> System.out.println(s));

		System.out.println("======Intermediate reduce()======");
		Stream<Integer> stream4 = Arrays.stream(i);
		int res = stream4.reduce(1, (sum, o) -> sum * o);
		System.out.println(res);
	}//main
}//class