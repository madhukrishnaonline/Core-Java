package com.nt.list;

import java.util.Comparator;

public class SortByUserName implements Comparator<UserData> {
	@Override
	public int compare(UserData o1, UserData o2) {
		UserData userData1 = (UserData) o1;
		UserData userData2 = (UserData) o2;

		int z = userData1.getUName().compareTo(userData2.getUName());
		if (z == 0)
			return 0;
		else if (z > 0)
			return 1;
		else
			return -1;
	}//compare
}//class