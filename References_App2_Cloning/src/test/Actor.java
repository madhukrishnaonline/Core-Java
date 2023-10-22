package test;

public class Actor extends Contact implements Cloneable 
{
	public String aName, addr, hNo;
	public double remun;

	// public Contact ob;
	/**
	 * public Actor(Contact ob) { this.ob=ob; }
	 */
	@Override
	public String toString() {
		return "ActorName: " + aName + "\nAddress: " + addr + "\nH/No: " + hNo + "\nMailId: " + mailId + "\nPhoneNo: "
				+ phoneNo + "\nRemuneration: " + remun;
	}

	public Object cloning() throws CloneNotSupportedException {
		Object o = super.clone();
		return o;
	}
}//class