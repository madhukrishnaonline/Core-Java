package test;

public class User1 implements Runnable {
	public Printer p = null;

	@Override
	public void run() {
		Printer.print(5, "Madhu");
	}
}//class