package mk;

import java.util.*;
import test.*;

@SuppressWarnings("serial")
public class BankMain extends Exception {
	public BankMain(String msg) {
		super(msg);
	}

	public static void main(String[] AA) // throws WithDraw
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		mk: while (true) {
			try {
				System.out.println("Enter the PinNo:");
				int pinNo = sc.nextInt();
				CheckPinNo cpn = new CheckPinNo();
				boolean pin = cpn.verify(pinNo);
				if (!pin) {
					BankMain bm = new BankMain("Invalid PinNo...");
					throw bm;
				} // end of if
				System.out.println("Select One Option");
				System.out.println("1.WithDraw\n2.Deposit");
				System.out.println("Enter the Option:");
				int opt = sc.nextInt();
				switch (opt) {
				case 1:
					System.out.println("Enter the Amount:");
					int a1 = sc.nextInt();
					if (!(a1 > 0 && a1 % 100 == 0)) {
						BankMain bm = new BankMain("Invalid Amount...");
						throw bm;
					} // end of if
					WithDraw wd2 = new WithDraw();
					wd2.process(a1);
					// System.out.println(a1);
					break mk;
				case 2:
					System.out.println("Enter the Amount:");
					int a2 = sc.nextInt();
					if (!(a2 > 0 && a2 % 100 == 0)) {
						BankMain bm = new BankMain("Invalid Amount...");
						throw bm;
					} // end of if
					Deposit dp = new Deposit();
					dp.process(a2);
					break mk;
				default:
					System.out.println("Invalid Choice...");
					break mk;
				}// end of switch
			} // end of try
			catch (BankMain | WithDraw bm) {
				System.out.println(bm.getMessage());
			} // end of catch
			count++;
			if (count == 3) {
				System.out.println("Transaction Blocked...");
				break mk;
			}
		} // end of while
		sc.close();
	}//main
}//class