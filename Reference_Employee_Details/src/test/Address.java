package test;

public class Address 
{
	public String sName, city;
	public int pinCode;

	public void getAddress() 
	{
		System.out.println("====Address====");
		System.out.println("PinCode: " + pinCode);
		System.out.println("Street Name: " + sName);
		System.out.println("City: " + city);
	}
}// class