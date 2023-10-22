package test;

public class Contact extends Address {
	public String mailId;
	public long phoneNo;

	public void getContact() {
		System.out.println("====Contact====");
		System.out.println("MailId: " + mailId);
		System.out.println("PhoneNo: " + phoneNo);
	}
}// class