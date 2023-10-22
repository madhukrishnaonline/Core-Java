package test;

public class EmployeeValues {
	public String eName, eDesg;
	public int bSal;
	public double totSal;

	public EmployeeValues(String eName, String eDesg, int bSal, double totSal) {
		this.eName = eName;
		this.eDesg = eDesg;
		this.bSal = bSal;
		this.totSal = totSal;
	}

	public String toString() {
		return eName + "\t" + eDesg + "\t" + bSal + "\t" + totSal;
	}
}// class