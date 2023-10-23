package test;

public class NextMultiple {
	public int oddRounder(int n) {
		if (n % 2 != 0) {
			return n = n + (10 - n % 10);
		} else {
			return n;
		}
	}
}//class