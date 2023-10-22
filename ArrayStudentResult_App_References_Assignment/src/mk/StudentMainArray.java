package mk;

import java.util.*;
import test.*;

public class StudentMainArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Students:");
		int n = Integer.parseInt(s.nextLine());
		Student a[] = new Student[n];
		System.out.println("Enter " + n + " Student Details: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = new Student();
			System.out.println("***Details of Student " + (i + 1) + "***");
			System.out.println("Enter the rollNo:");
			a[i].rollNo = s.nextLine();
			int rollNo = a[i].rollNo.length();
			if (rollNo == 10) {
				GenerateBranch gb = new GenerateBranch();
				String br = gb.generate(a[i].rollNo.substring(6, 8));
				if (br == null) {
					System.out.println("rollNo holding Invalid Branch Code....");
					i--;
				} // end of if
				else {
					System.out.println("Enter the Name:");
					a[i].name = s.nextLine();
					System.out.println("Enter the branch:");
					a[i].branch = s.nextLine().toUpperCase();
					CheckBranch cb = new CheckBranch();
					boolean b = cb.verify(a[i].branch);
					if (b) {
						if (a[i].branch.equals(br)) {
							System.out.println("Enter Student hNo:");
							a[i].ob1.hNo = s.nextLine();
							System.out.println("Enter Student StreetName:");
							a[i].ob1.sName = s.nextLine();
							System.out.println("Enter Student City:");
							a[i].ob1.city = s.nextLine();
							System.out.println("Enter Student Pincode:");
							a[i].ob1.pincode = Integer.parseInt(s.nextLine());
							System.out.println("Enter Student mailId:");
							a[i].ob.mailId = s.nextLine();
							System.out.println("Enter Student phNo:");
							a[i].ob.phNo = s.nextLong();
							System.out.println("==Enter 6 Sub Marks==");
							int j = 1;// initialization
							int totM = 0;
							boolean p = false;
							while (j <= 6) {
								System.out.println("Enter marks of subject-" + j);
								int sub = s.nextInt();
								if (sub < 0 || sub > 100) {
									System.out.println("Invalid Marks...");
									continue;
									// skips the below lines from the iteration
								}//if
								if (sub >= 0 && sub <= 34) {
									p = true;
								}//if
								totM = totM + sub;
								j++;
							} // end of while
							a[i].TotMarks = totM;
							a[i].per = (float) a[i].TotMarks / 6;
							SResult sr = new SResult();
							a[i].result = sr.generate(a[i].per, p);
						} // end of
						else {
							System.out.println("rollNo not matched with branch..");
							i--;
						}
					} // end of if
					else {
						System.out.println("Invalid Branch....");
						i--;
					} // end of else
				} // end of else
			} // end of if
			else {
				System.out.println("Invalid rollNo:");
				i--;
			} // end of else
		} // end of loop
		for (Student m : a) {
			System.out.println(m.toString());
		} // end of loop
		s.close();
	}//main
}//class