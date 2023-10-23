package mk;

import test.*;
import java.util.*;

@SuppressWarnings("unused")

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				int count = 0;
				mk: while (true) {
					System.out.println("Enter rollNo:");
					String rollNo = sc.nextLine();
					int k = rollNo.length();
					if (k == 10) {
						GenerateBranch gb = new GenerateBranch();
						String code = gb.generate(rollNo.substring(5, 7));
						if (code == null) {
							System.out.println("Invalid BranchCode...");
						} // end of if
						else {
							System.out.println("Enter the Branch:(CIVIL,MECH,EEE,ECE,CSE)");
							String brnch = sc.nextLine().toUpperCase();
							CheckBranch cb = new CheckBranch();
							boolean bl = cb.checkBranch(brnch);
							if (bl) {
								System.out.println("Enter Student Name:");
								String sName = sc.nextLine();
								System.out.println("Enter 6 Sub Marks:");
								int j = 1;
								int totM = 0;
								boolean p = false;
								while (j <= 6) {
									System.out.println("Enter sub-" + j + " Marks:");
									int sub = sc.nextInt();
									if (sub < 0 || sub > 100) {
										System.out.println("Invalid Marks...");
										continue;
									}//if
									if (sub >= 0 && sub <= 34) {
										p = true;
									}//if
									totM = totM + sub;
									j++;
								} // end of while
							} // end of if
							else {
								System.out.println("Invalid Branch....");
							} // end of else
						} // end of else
					} // end of if
					else {
						System.out.println("Invalid rollNo...");
					}//else
				} // end of loop
			} // end of try
			catch (Exception ex) {
				ex.printStackTrace();
			} // end of catch
		} // end of try-with-resource
	}//main
}//class