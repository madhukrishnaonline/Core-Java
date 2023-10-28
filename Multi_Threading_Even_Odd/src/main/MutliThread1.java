package main;

import test.EvenNumber;
import test.OddNumber;

public class MutliThread1 {
	public static void main(String[] args) {
		EvenNumber en = new EvenNumber();
		OddNumber on = new OddNumber();

		Thread t1 = new Thread(en);
		Thread t2 = new Thread(on);

		t1.start();
		t2.start();
	}//main
}//class