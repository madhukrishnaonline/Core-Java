package test;

public class Producer implements Runnable {
	public StringBuffer sb = null;

	public Producer() {
		sb = new StringBuffer();
	}

	@Override
	public void run() {
		try {
			synchronized (sb) {
				for (int i = 1; i <= 10; i++) {
					sb.append(i + ":");
					System.out.println("Producer appending Data....");
					Thread.sleep(2000);
				} // end of loop
				sb.notify();
			} // end of lock
		} // end of try
		catch (Exception ex) {
			ex.printStackTrace();
		} // end of catch
	}//run
}//class