package test;

public class HostelDetails {
	public String hName, hType, addr;
	public int hFee;

	public HostelDetails(String hName, String hType, String addr, int hFee) {
		this.hName = hName;
		this.hType = hType;
		this.addr = addr;
		this.hFee = hFee;
	}

	@Override
	public String toString() {
		return "HostelName: " + hName + "\nHostelType: " + hType + "\nAddress: " + addr + "\nHostelFee: " + hFee;
	}
}//class