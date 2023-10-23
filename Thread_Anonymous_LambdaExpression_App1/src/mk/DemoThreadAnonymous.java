package mk;

public class DemoThreadAnonymous {
	public static void main(String[] args) {
		Runnable ob1 = new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					try {
						System.out.println("Registartion for " + Thread.currentThread().getName());
						Thread.sleep(2000);
					} // end of try
					catch (Exception e) {
					}//catch
				} // end of loop
			}///run
		};
		Runnable ob2 = new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					try {
						System.out.println("Login for " + Thread.currentThread().getName());
						Thread.sleep(2000);
					} // end of try
					catch (Exception e) {
					}//catch
				} // end of loop
			}///run
		};
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);

		System.out.println(Thread.MAX_PRIORITY - 3);
		System.out.println(Thread.MIN_PRIORITY + 3);
		System.out.println(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
	}//main
}//class