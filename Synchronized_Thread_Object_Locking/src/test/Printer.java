package test;

public class Printer {
	public synchronized static void print(int n, String uName) {
		for (int i = 1; i <= n; i++) {
			System.out.println("Print Out for :" + uName);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of loop
	}
}//interface