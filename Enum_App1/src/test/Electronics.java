package test;

public enum Electronics {
	cooker(2000.50f), riceCooker(3000), mixi(3500), grinder(3200), geaser(2400);

	public float price;

	Electronics(float price) {
		this.price = price;
	}

	public final float getPrice() {
		return price;
	}

	public final float setPrice(float price) {
		return price;
	}
}//class