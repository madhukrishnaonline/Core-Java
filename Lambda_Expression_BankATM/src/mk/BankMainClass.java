package mk;

import java.util.*;
import test.*;

public class BankMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Balance b1 = new Balance();
		int count = 0;
		mk: while (true) {
			System.out.println("Enter the PinNo :");
			int PinNo = sc.nextInt();
			CheckPinNo cpn = new CheckPinNo();
			boolean bl = cpn.verify(PinNo);
			if (bl) {
				System.out.println("***Select the Option***");
				System.out.println("1.WithDraw\n2.Deposit\n3.CheckBalance");
				System.out.println("Enter the Option :");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter the Amount :");
					int a1 = sc.nextInt();
					if (a1 > 0 && a1 % 100 == 0) {
						Transaction wd = (int amt) -> {
							if (amt <= b1.bal) {
								System.out.println("Amount Withdrawn... :" + amt);
								b1.bal = b1.bal - amt;
								System.out.println("Balance Amount : " + b1.getBalance());
								System.out.println("Transaction Completed...");
							} // if
							else {
								System.out.println("Insufficient Funds...");
							} // else
						};
						wd.process(a1);
					} // if
					else {
						System.out.println("Invalid Amount...");
					} // else
					break mk;
				case 2:
					System.out.println("Enter the Amount :");
					int a2 = sc.nextInt();
					if (a2 > 0 && a2 % 100 == 0) {
						Transaction dt = (int v2) -> {
							System.out.println("Amount Diposited... :" + v2);
							b1.bal = b1.bal + v2;
							;
							System.out.println("Balance Amount : " + b1.getBalance());
							System.out.println("Transaction Completed...");
						};
						dt.process(a2);
					} // if
					else {
						System.out.println("Invalid Amount...");
					} // else
					break mk;
				case 3:
					System.out.println("Account Balance:" + b1.bal);
					b1.bal = b1.bal;
					System.out.println("Transaction Successfull...");
					break mk;
				default:
					System.out.println("Invalid Option....");
					break mk;
				}// switch
			} // if
			else {
				System.out.println("Invalid PinNo..." + count++);
				// count++;
			} // else
			if (count == 3) {
				System.out.println("Transaction Blocked...");
				break;
			} // end of if
		} // end of loop
	}// main
}// class