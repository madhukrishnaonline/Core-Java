package mk;

public class DemoThread4 {
	public static void main(String[] args) {
		new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				try {
					System.out.println("Registartion for " + Thread.currentThread().getName());
					Thread.sleep(2000);
				} // end of try
				catch (Exception e) {
				}//catch
			} // end of loop
		}).start();
		new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				try {
					System.out.println("Login for " + Thread.currentThread().getName());
					Thread.sleep(2000);
				} // end of try
				catch (Exception e) {
				}//catch
			} // end of loop
		}).start();
		// System.out.println(Thread.MAX_PRIORITY-3);
		// System.out.println(Thread.MIN_PRIORITY+3);
		// System.out.println(Thread.NORM_PRIORITY);
	}//main
}//class