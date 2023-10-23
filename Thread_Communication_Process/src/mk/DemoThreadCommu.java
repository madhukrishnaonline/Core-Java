package mk;

import test.*;

public class DemoThreadCommu {
	public static void main(String[] args) throws InterruptedException {

		Producer p = new Producer();
		Consumer c = new Consumer(p);

		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);

		System.out.println("Wait 5 Seconds....");
		Thread.sleep(5000);

		t2.start();
		t1.start();
	}//main
}//class