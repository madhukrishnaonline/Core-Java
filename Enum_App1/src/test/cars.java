package test;

public enum cars {
	bmw(1500), rollsRoyce(1700), ford(1900);

	public int price;

	cars(int price) {
		this.price = price;
	}

	public final int getPrice() {
		return price;
	}

	public final void setPrice(int price) {
		this.price = price;
	}
}//class