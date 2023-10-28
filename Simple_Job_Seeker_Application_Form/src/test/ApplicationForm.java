package test;

import java.util.Scanner;

public class ApplicationForm {
	Scanner sc = new Scanner(System.in);
	public boolean validateUserName(String userName) {
		System.out.println("Enter UserName :: ");
		String uName = sc.nextLine();
		int len = uName.length();
		if (len >= 8 && len <= 20) {
			if (uName.endsWith("_job")) {
				System.out.println("Registration Successfull....");
				return true;
			} // if
			else {
				System.out.println("User Name should ends with _job....");
				return false;
			} // else
		} // if
		else {
			System.out.println("User Name Must contain atleast 8 characters Minimum.....");
			return false;
		} // else
	}// method
}// class