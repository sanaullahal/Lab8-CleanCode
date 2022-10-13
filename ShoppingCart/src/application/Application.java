package application;
import products.Product;
import shoppingcart.ShoppingCart;


public class Application {

	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();
		Product product1 = new Product("A123", 100.0, "TV");
		shoppingCart.addProduct(product1);
		Product product2 = new Product("A665", 75.0, "MP3 Player");
		shoppingCart.addProduct(product2);
		Product product3 = new Product("A665", 75.0, "MP3 Player");
		shoppingCart.addProduct(product3);
		
		shoppingCart.printInvoice();
		shoppingCart.removeProduct(product3);
		shoppingCart.removeProduct(product2);
		shoppingCart.printInvoice();

	}

}
