package test;

public class Deposit implements Transaction {
	public void process(int amt) {
		System.out.println("Amount Deposited :" + amt);
		b.bal = b.bal + amt;
		System.out.println("Remaining Balance:" + b.getBalance());
		System.out.println("Transaction Completed...");
	}
}//class