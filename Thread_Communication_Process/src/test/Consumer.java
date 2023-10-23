package test;

public class Consumer implements Runnable {
	public Producer p = null;

	public Consumer(Producer p) {
		this.p = p;
	}

	@Override
	public void run() {
		try {
			synchronized (p.sb) {
				System.out.println("Consumer Blocked....and Waiting for msg!");
				p.sb.wait();
				System.out.println("====Display from Consumer====");
				System.out.println(p.sb.toString());
			} // end of lock
		} // end of try
		catch (Exception ex) {
			ex.printStackTrace();
		}//catch
	}//run
}//class