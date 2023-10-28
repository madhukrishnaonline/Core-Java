package test;

public class OddNumber implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i + " :: Odd Number");
			try {
				Thread.sleep(2000);
			} //try
			catch (InterruptedException e) {
				e.printStackTrace();
			} //catch
		} //for
	}//Method
}//Class