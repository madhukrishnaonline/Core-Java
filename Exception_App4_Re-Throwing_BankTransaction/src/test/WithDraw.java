package test;

@SuppressWarnings("serial")
public class WithDraw extends Exception implements Transaction {
	public WithDraw() {
	}

	public WithDraw(String msg) {
		super(msg);
	}

	public void process(int amt) throws WithDraw {
		try {
			if (amt > b.bal) {
				WithDraw wd = new WithDraw("Insufficient Funds...");
				throw wd;
			} // end of if
			System.out.println("Amount Withdrawn..." + amt);
			b.bal = b.bal - amt;
			System.out.println("Remaining Balance:" + b.getBalance());
			System.out.println("Transaction Completed...");
		} // end of try
		catch (WithDraw wd) {
			// System.out.println(wd.getMessage());
			throw wd;
		} // end of catch
	}//main
}//class