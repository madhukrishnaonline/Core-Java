package main;

import test.ApplicationForm;

public class RegisterForm {
	public static void main(String[] args) {
		ApplicationForm af = new ApplicationForm();
		String uName = null;
		boolean bl = af.validateUserName(uName);
		System.out.println(bl);
	}//main
}//class