package case2;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a shopping cart that stores products and their quantities.
 */
public class ShoppingCart {

    private Map<Product, Integer> cartItems = new HashMap<>();
    private double totalPrice = 0.0;

    /**
     * Adds a product to the shopping cart.
     */
    public void addProduct(Product product, int quantity) {
        cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
        calculateTotalPrice();
        System.out.println(quantity + " x " + product.getName() + " added to cart.");
    }

    /**
     * Removes a product from the cart.
     */
    public void removeProduct(Product product) {
        if (cartItems.containsKey(product)) {
            cartItems.remove(product);
            calculateTotalPrice();
            System.out.println(product.getName() + " removed from cart.");
        }
    }

    /**
     * Calculates the total price of all products in the cart.
     */
    public void calculateTotalPrice() {
        totalPrice = 0.0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
    }

    /**
     * Displays all items in the shopping cart.
     */
    public void viewCartItems() {
        System.out.println("\n--- Shopping Cart ---");
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey().getName() + " x " + entry.getValue());
        }
        System.out.println("Total Price: Rs." + totalPrice);
    }
}
