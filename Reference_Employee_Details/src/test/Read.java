package test;

import java.util.*;

public class Read extends Employee {
	@SuppressWarnings("removal")
	public void readEmployee(Scanner sc) {
		System.out.println("***Enter the Employee Details***");
		System.out.println("Enter the Employee Id:");
		super.eId = new String(sc.nextLine());
		System.out.println("Enter the Employee Name:");
		super.eName = new String(sc.nextLine());
		System.out.println("Enter the Employee Desg:");
		super.desg = new String(sc.nextLine());
		System.out.println("Enter the Employee Salary:");
		super.sal = new Float(Float.parseFloat(sc.nextLine()));
		System.out.println("Enter the Employee MailId:");
		super.mailId = new String(sc.nextLine());
		System.out.println("Enter the Employee PhoneNo:");
		super.phoneNo = new Long(Long.parseLong(sc.nextLine()));
		System.out.println("Enter the Employee StreetName:");
		super.sName = new String(sc.nextLine());
		System.out.println("Enter the Employee City:");
		super.city = new String(sc.nextLine());
		System.out.println("Enter the Employee PinCode:");
		super.pinCode = new Integer(Integer.parseInt(sc.nextLine()));
	}//readEmployee
}//class