package test;

public class Product extends Object implements Comparable<Object> {
	public String pId, pName;
	public float price;
	public int qty;

	public Product(String pName, String pId, int qty, float price) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "pId: " + pId + "\npName: " + pName + "\nprice: " + price + "\nqty: " + qty;
	}

	@Override
	public int compareTo(Object o) {
		Product pr = (Product) o;
		int k = pName.compareTo(pr.pName);
		if (k == 0)
			return 0;
		else if (k > 1)
			return 1;
		else
			return -1;
	}
}// class