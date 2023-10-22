package test;

public class Contact implements Cloneable 
{
	public String mailId;
	public long phoneNo;

	public Object cloning() throws CloneNotSupportedException {
		Object o = super.clone();
		return o;
	}
}// class