package test;

public class Employee extends Contact
{
	public String eId, eName, desg;
	public float sal;

	// public Contact c;
	// public Address ad;
	/**
	 * public Employee(Contact c,Address ad) { this.c=c; this.ad=ad; }
	 */
	public void getEmployee() {
		System.out.println("====Employee Details====");
		System.out.println("EID: " + eId);
		System.out.println("eName: " + eName);
		System.out.println("Designation: " + desg);
		System.out.println("Salary: " + sal);
	}//getEmployee
}//class