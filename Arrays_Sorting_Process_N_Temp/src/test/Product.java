package test;

public class Product extends Object implements Comparable<Object> {
	public String pName;
	public float price;
	public int pId, qty;

	@Override
	public String toString() {
		return "pId: " + pId + "\npName: " + pName + "\nprice: " + price + "\nqty: " + qty;
	}

	@Override
	public int compareTo(Object o) {
		Product prod = (Product) o;
		if (pId == prod.pId)
			return 0;
		else if (pId > prod.pId)
			return 1;
		else
			return -1;
	}//compareTo
}// class