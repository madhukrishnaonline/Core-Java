package test;

public class Employee extends Object implements Cloneable {
	public String eName, eId, eDesg;
	public long phoneNo;
	public EmpContact ec = new EmpContact(null);

	@Override
	public String toString() {
		return eName + "\n" + eId + "\n" + eDesg + "\n" + phoneNo;
	}

	public Object startCloning() {
		Object o = null;
		try {
			o = super.clone();
		} // end of try
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return o;
	}
}//class