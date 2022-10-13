package shoppingcart;
import java.util.ArrayList;


import java.util.Iterator;

import products.Product;

public class ShoppingCart {

	private ArrayList<CartLine> cartLineList = new ArrayList<CartLine>();

	public void addProduct(Product product){
		if (isProductExists(product.getProductName())) return;
		CartLine cartLine = new CartLine();
		cartLine.setProduct(product);
		cartLine.setQuantity(1);
		cartLineList.add(cartLine);
	}

	private boolean isProductExists(String newProduct){
		for (CartLine cartLine : cartLineList) {
			String existProduct = cartLine.getProduct().getProductName();
			if (existProduct.equals(newProduct)) {
				cartLine.setQuantity(cartLine.getQuantity() + 1);
				return true;
			}
		}
		return false;
	}
	public void removeProduct(Product product){
		Iterator<CartLine> iterator = cartLineList.iterator();
		while (iterator.hasNext()){
			CartLine cartLine = iterator.next();
			if (cartLine.getProduct().getProductName().equals(product.getProductName())){
				if (cartLine.getQuantity() > 1){
					cartLine.setQuantity(cartLine.getQuantity() - 1);
				}else{
					iterator.remove();
				}
			}
		}
	}
	public void printInvoice(){
		System.out.println("Content of the Shopping Cart:");
		for (CartLine cartLine : cartLineList) {
			System.out.println(cartLine.getQuantity() + " "
					+ cartLine.getProduct().getProductName() + " "
					+ cartLine.getProduct().getDescription() + " "
					+ cartLine.getProduct().getPrice());
		}
		System.out.println("Total price ="+getTotalPrice());
	}

	public double getTotalPrice(){
		double totalPrice = 0.0;
		for (CartLine cartLine : cartLineList) {
			totalPrice = totalPrice + (cartLine.getProduct().getPrice() * cartLine.getQuantity());
		}
		return totalPrice;
	}
}
