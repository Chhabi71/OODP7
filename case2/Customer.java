package case2;

import java.util.List;

/**
 * Represents a customer in the e-commerce shopping system.
 */
public class Customer {

    private String customerId;
    private String name;
    private String email;
    private String password;
    private ShoppingCart cart;

    public Customer(String customerId, String name, String email, String password) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cart = new ShoppingCart();
    }

    /**
     * Registers a new customer.
     */
    public void register() {
        System.out.println("Customer registered: " + name);
    }

    /**
     * Logs in the customer.
     */
    public boolean login(String enteredEmail, String enteredPassword) {
        if (email.equals(enteredEmail) && password.equals(enteredPassword)) {
            System.out.println("Login successful.");
            return true;
        }
        System.out.println("Login failed.");
        return false;
    }

    /**
     * Displays list of products.
     */
    public void viewProducts(List<Product> products) {
        System.out.println("\n--- Product List ---");
        for (Product product : products) {
            product.getDetails();
        }
    }

    /**
     * Adds a product to the customer's cart.
     */
    public void addToCart(Product product, int quantity) {
        if (product.checkAvailability(quantity)) {
            cart.addProduct(product, quantity);
        } else {
            System.out.println("Not enough stock for " + product.getName());
        }
    }

    /**
     * Performs checkout.
     */
    public void checkout() {
        System.out.println("\nCheckout completed successfully!");
    }

    public ShoppingCart getCart() {
        return cart;
    }
}
