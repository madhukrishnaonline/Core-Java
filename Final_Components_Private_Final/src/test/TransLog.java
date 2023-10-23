package test;

public class TransLog {
	private final String accHolder, ifscCode, branch;
	private final long accNo;

	public TransLog(String ifscCode, String branch, long accNo, String accHolder) {
		this.accHolder = accHolder;
		this.ifscCode = ifscCode;
		this.branch = branch;
		this.accNo = accNo;
	}

	public final String getAccHolder() {
		return accHolder;
	}

	public final String getIfscCode() {
		return ifscCode;
	}

	public final String getBranch() {
		return branch;
	}

	public final long getAccNo() {
		return accNo;
	}
	
}//class