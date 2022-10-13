package products;
public class Product {

	private String productName;
	private double price;
	private String description;

	public Product(String productName, double price, String description) {
		super();
		this.productName = productName;
		this.price = price;
		this.description = description;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
