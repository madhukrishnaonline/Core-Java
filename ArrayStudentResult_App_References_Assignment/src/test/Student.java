package test;

public class Student {
	public String name, rollNo, branch, result, hNo, sName, city, mailId;
	public int TotMarks, pincode;
	public float per;
	public long phNo;
	public Contact ob = new Contact();
	public Address ob1 = new Address();

	public String toString() {
		return name + "\t" + rollNo + "\t" + branch + "\t" + ob1.hNo + "\t" + ob1.sName + "\t" + ob1.city + "\t"
				+ ob1.pincode + "\t" + ob.mailId + "\t" + ob.phNo + "\t" + TotMarks + "\t" + per;
	}
}//class