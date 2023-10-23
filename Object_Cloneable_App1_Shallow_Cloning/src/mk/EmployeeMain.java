package mk;

import test.*;
import java.util.*;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				System.out.println("***Original Object***");
				Employee emp = new Employee();
				System.out.println("Enter the Name:");
				emp.eName = sc.nextLine();
				System.out.println("Enter the EmployeeId:");
				emp.eId = sc.nextLine();
				System.out.println("Enter the Employee Desg:");
				emp.eDesg = sc.nextLine();
				System.out.println("Enter the Employee MailId:");
				emp.ec.mailId = sc.nextLine();
				System.out.println("Enter the PhoneNo.:");
				emp.phoneNo = sc.nextLong();
				System.out.println("===EmployeeDetails===");
				System.out.println("Employee Name:" + emp.eName);
				System.out.println("Employee Id:" + emp.eId);
				System.out.println("Employee Desg:" + emp.eDesg);
				System.out.println("Employee PhoneNo.:" + emp.phoneNo);
				System.out.println("Employee MailId:" + emp.ec.mailId);
				System.out.println("===HashCodes of Objects===");
				System.out.println("HashCode of Employee: " + emp.hashCode());
				System.out.println("HashCode of EmpContact:" + emp.ec.hashCode());
				System.out.println("***Duplicate Object***");
				System.out.println("===Display from Cloned Object===");
				Employee emp2 = (Employee) emp.startCloning();
				System.out.println("Employee Name:" + emp2.eName);
				System.out.println("Employee Id:" + emp2.eId);
				System.out.println("Employee Desg:" + emp2.eDesg);
				System.out.println("Employee MailId:" + emp2.ec.mailId);
				System.out.println("===HashCodes of Objects===");
				System.out.println("HashCode of Employee: " + emp2.hashCode());
				System.out.println("HashCode of EmpContact:" + emp2.ec.hashCode());
			} // end of try
			catch (Exception ex) {
				System.out.println("Enter only String Type Data....");
				ex.printStackTrace();
			}
		} // end of try-with-resource
	}//main
}//class