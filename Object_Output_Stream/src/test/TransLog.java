package test;

import java.io.*;
import java.util.*;

@SuppressWarnings("serial")
public final class TransLog implements Serializable {
	private final long hAccNo, bAccNo;
	private final double amt;
	private final Date dateTime;

	public TransLog(long hAccNo, long bAccNo, double amt, Date dateTime) {
		this.hAccNo = hAccNo;
		this.bAccNo = bAccNo;
		this.amt = amt;
		this.dateTime = dateTime;
	}

	public final long gethAccNo() {
		return hAccNo;
	}

	public final long getbAccNo() {
		return bAccNo;
	}

	public final double getAmt() {
		return amt;
	}

	public final Date getDateTime() {
		return dateTime;
	}

}//class