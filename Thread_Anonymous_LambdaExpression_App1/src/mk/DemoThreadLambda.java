package mk;

public class DemoThreadLambda {
	public static void main(String[] args) {
		Runnable ob1 = () -> {
			for (int i = 1; i <= 5; i++) {
				try {
					System.out.println("Registartion for " + Thread.currentThread().getName());
					Thread.sleep(2000);
				} // end of try
				catch (Exception e) {
				}
			} // end of loop
		};
		Runnable ob2 = () -> {
			for (int i = 1; i <= 5; i++) {
				try {
					System.out.println("Login for " + Thread.currentThread().getName());
					Thread.sleep(2000);
				} // end of try
				catch (Exception e) {
				}
			} // end of loop
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