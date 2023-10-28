package test;

public class EvenNumber implements Runnable {
	public void run() {
		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println(i + " :: Even Number");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //catch
		} //for 
	}//Method
}//class