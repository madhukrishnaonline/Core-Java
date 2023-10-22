package test;

@SuppressWarnings("rawtypes")
public class Product extends Object implements Comparable
{
	public String code, name;
	public float price;
	public int qty;

	public Product(String code, String name, float price, int qty) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public String toString() {
		return code + "\t" + name + "\t" + price + "\t" + qty;
	}

	public int compareTo(Object o) {
		Product pr = (Product) o;
		int c = name.compareTo(pr.name);
		if (c == 0) {
			return 0;
		} else if (c > 0) {
			return 1;
		} else {
			return -1;
		}
	}
}//class