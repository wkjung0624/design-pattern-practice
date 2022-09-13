package ch04.pizza;

public abstract class Pizza {
	protected String productName;

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public abstract void prepare();
	public abstract void bake();
	public abstract void cut();
	public abstract void box();
}
