package mk;

import test.*;

public class DemoLocking {
	public static void main(String[] args) throws InterruptedException {

		User1 u1 = new User1();
		User2 u2 = new User2();

		Thread t1 = new Thread(u1);
		Thread t2 = new Thread(u2);

		System.out.println("Wait for 5 Seconds to print....");
		Thread.sleep(5000);

		t1.start();
		t2.start();
	}//main
}//class