package test;

public class EmpContact extends Object {
	public String mailId;

	public EmpContact(String mailId) {
		this.mailId = mailId;
	}

	@Override
	public String toString() {
		return "MailId:" + mailId;
	}
}//class