package mk;

import java.util.Scanner;

import test.TransLog;

public final class DemoFinal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				System.out.println("Enter AccountHolder:");
				String accHolder = new String(sc.nextLine());
				System.out.println("Enter branch:");
				String branch = new String(sc.nextLine());
				System.out.println("Enter ifscCode:");
				String ifscCode = new String(sc.nextLine());
				System.out.println("Enter AccountNo:");
				long accNo = sc.nextLong();
				TransLog tl = new TransLog(accHolder, branch, accNo, ifscCode);
				System.out.println("=====Account Details====");
				System.out.println("AccountNo: " + tl.getAccNo());
				System.out.println("AccountHolder: " + tl.getAccHolder());
				System.out.println("Branch: " + tl.getBranch());
				System.out.println("IFSC Code: " + tl.getIfscCode());
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} // end of try-with-resource
	}//main
}//class