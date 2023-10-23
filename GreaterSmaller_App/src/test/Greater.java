package test;

public class Greater {
	public int compare(int x, int y, int z) {
		if (x > y && x > z) {
			return x;
		} else if (y > x && z > x) {
			return y;
		} else {
			return z;
		}
	}//compare
}//class