package mk;

public class MultiThread {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread Will Start In 5 Seconds....");
		Thread.sleep(5000);
		new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Registration for " + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // end of loop
		}).start();
		new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Login for " + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // end of loop
		}).start();
	}//main
}//class