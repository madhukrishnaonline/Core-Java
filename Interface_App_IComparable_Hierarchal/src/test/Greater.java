package test;

public class Greater implements IComparable {
	public int compare(int x, int y, int z) {
		if (x > y && x > z)
			return x;
		else if (y > x && y > z)
			return y;
		else
			return z;
	}
}//class