package com.nt.list;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
	private String uName;
	private String fName;
	private String lName;
	private String famName;
	private long mobile;
	private String address;

	@Override
	public String toString() {
		return uName + "\t" + fName + "\t" + lName + "\t" + famName + "\t" + mobile + "\t" + address;
	}
}//class