package test;

public class User2 implements Runnable {
	public Printer p = null;

	@Override
	public void run() {
		Printer.print(5, "Krishna");
	}
}//class