package test;

public class Employee extends Object implements Cloneable {
	public String eId, eName, addr;
	public float sal;
	public EmpContact ec = new EmpContact();

	@Override
	public String toString() {
		return "eId: " + eId + "\neName: " + eName + "\nAddress: " + addr + "\nSal: " + sal;
	}

	public Object cloning() {
		Object o = null;
		try {
			o = super.clone();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return o;
	}
}//class