package mk;

import test.*;
import java.util.*;

@SuppressWarnings("unused")
public class ObjectCloning {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter Employee Id:");
		emp.eId = sc.nextLine();
		System.out.println("Enter Employee Name:");
		emp.eName = sc.nextLine();
		System.out.println("Enter Employee Address:");
		emp.addr = sc.nextLine();
		System.out.println("Enter Employee mailId:");
		emp.ec.mailId = sc.nextLine();
		System.out.println("Enter Employee sal:");
		emp.sal = sc.nextFloat();
		System.out.println("Enter Employee Phone No.:");
		emp.ec.phoneNo = sc.nextLong();
		System.out.println("===Original Object===");
		System.out.println(emp.toString());
		System.out.println(emp.ec.toString());
		System.out.println("***HashCodes of Object***");
		System.out.println("HashCode of Employee:" + emp.hashCode());
		System.out.println("HashCodes of EmpContact:" + emp.ec.hashCode());
		System.out.println("===Cloned Object===");
		Employee o = (Employee) emp.cloning();
		EmpContact o1 = (EmpContact) emp.ec.cloning();
		System.out.println(o.toString());
		System.out.println(o.ec.toString());
		System.out.println("HashCodes of Employee:" + o.hashCode());
		System.out.println("HashCode of EmpContact:" + o.ec.hashCode());
		sc.close();
	}// main
}// class