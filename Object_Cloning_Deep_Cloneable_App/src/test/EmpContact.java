package test;

public class EmpContact extends Object implements Cloneable {
	public String mailId;
	public long phoneNo;

	@Override
	public String toString() {
		return "MailId:" + mailId + "\nphoneNo.:" + phoneNo;
	}

	public Object cloning() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
}//class